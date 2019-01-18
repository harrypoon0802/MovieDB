package com.example.kinhangpoon.moviedb.presenter

import com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MovieSearchPresenterImplTest {
    @RelaxedMockK
    lateinit var mockView: MovieSearchContract.View
    @RelaxedMockK
    lateinit var mockRepository: MovieSearchRepository

    lateinit var presenter: MovieSearchPresenterImpl

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        presenter = MovieSearchPresenterImpl(mockView, mockRepository)
    }

    @Test
    fun `test when call searchByQuery method`() {
        presenter.searchByQuery("jack", "1")
        verify {
            mockView.showLoadingDialog()
            mockRepository.searchByQuery(eq("jack"), eq("1"), any())
        }
    }

}