package com.hha.heinhtetaung.movies.adapters

import android.content.Context
import android.view.ViewGroup
import com.hha.heinhtetaung.movies.R
import com.hha.heinhtetaung.movies.viewholders.BaseViewHolder
import com.hha.heinhtetaung.movies.viewholders.MovieNameViewHolder
import java.util.*

class MovieNameAdapter(context: Context) : BaseRecyclerAdapter<MovieNameViewHolder, Objects>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Objects> {
        val movieNameItemView = mLayoutInflator.inflate(R.layout.item_movies, parent, false)
        return MovieNameViewHolder(movieNameItemView)
    }
}