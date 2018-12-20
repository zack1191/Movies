package com.hha.heinhtetaung.movies.adapters

import android.content.Context
import android.view.ViewGroup
import com.hha.heinhtetaung.movies.R
import com.hha.heinhtetaung.movies.viewholders.BaseViewHolder
import com.hha.heinhtetaung.movies.viewholders.MovieGenreViewHolder
import java.util.*

class MovieGenreAdapter(context: Context) : BaseRecyclerAdapter<MovieGenreAdapter, Objects>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Objects> {
        val genreItemView = mLayoutInflator.inflate(R.layout.item_genre, parent, false)
        return MovieGenreViewHolder(genreItemView)
    }
}