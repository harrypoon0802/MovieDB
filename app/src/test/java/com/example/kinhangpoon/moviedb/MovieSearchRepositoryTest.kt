package com.example.kinhangpoon.moviedb

import com.example.kinhangpoon.moviedb.model.response.Response
import com.example.kinhangpoon.moviedb.model.service.MovieSearchApi
import com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.slot
import io.mockk.verify
import okhttp3.ResponseBody
import org.junit.Before
import org.junit.Test
import retrofit2.Call
import retrofit2.Callback
import java.io.IOException

class MovieSearchRepositoryTest {
    @RelaxedMockK
    lateinit var mockApi: MovieSearchApi
    @RelaxedMockK
    lateinit var mockMovieCallback: MovieSearchRepository.movieSearchCallback
    @RelaxedMockK
    lateinit var mockCall: Call<Response>

    lateinit var repository: MovieSearchRepository

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        repository = MovieSearchRepository(mockApi)
    }

    @Test
    fun `when search by query successfully, call back on success`() {
        every { mockApi.searchMovie(any(), any(), any()) } returns mockCall
        val response = Response()
        response.results = mutableListOf()
        val slot = slot<Callback<Response>>()
        every { mockCall.enqueue(capture(slot)) }.answers {
            slot.captured.onResponse(mockCall, retrofit2.Response.success(response))
        }

        repository.searchByQuery("", "", mockMovieCallback)
        verify {
            mockMovieCallback.onSuccess(any())
        }
    }

    @Test
    fun `when response of search by query is unsuccessful, call back on failure`() {
        every { mockApi.searchMovie(any(), any(), any()) } returns mockCall
        val response = Response()
        response.results = mutableListOf()
        val slot = slot<Callback<Response>>()
        every { mockCall.enqueue(capture(slot)) }.answers {
            slot.captured.onResponse(mockCall, retrofit2.Response.error(503, ResponseBody.create(null, "")))
        }

        repository.searchByQuery("", "", mockMovieCallback)
        verify {
            mockMovieCallback.onFailure()
        }
    }

    @Test
    fun `when fail to search by query, call back on failure `() {
        every { mockApi.searchMovie(any(), any(), any()) } returns mockCall
        val response = Response()
        response.results = mutableListOf()
        val slot = slot<Callback<Response>>()
        every { mockCall.enqueue(capture(slot)) }.answers {
            slot.captured.onFailure(mockCall, IOException())
        }

        repository.searchByQuery("", "", mockMovieCallback)
        verify {
            mockMovieCallback.onFailure()
        }
    }
}