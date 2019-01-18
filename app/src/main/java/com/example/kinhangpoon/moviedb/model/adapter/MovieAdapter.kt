package com.example.kinhangpoon.moviedb.model.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kinhangpoon.moviedb.R
import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import kotlinx.android.synthetic.main.item_layout.view.*

class MovieAdapter(val movies: MutableList<MovieResponse>, val delegate: SelectedMovieDelegate) :
    RecyclerView.Adapter<MovieAdapter.MoiveViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoiveViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MoiveViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MoiveViewHolder, position: Int) {
        val movie = movies[position]
        holder.itemView.title.text = movie.title

        holder.itemView.setOnClickListener {
            delegate.onMovieSelected(movie)
        }
    }

    class MoiveViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)

    interface SelectedMovieDelegate {
        fun onMovieSelected(
            movie: MovieResponse
        )
    }
}

