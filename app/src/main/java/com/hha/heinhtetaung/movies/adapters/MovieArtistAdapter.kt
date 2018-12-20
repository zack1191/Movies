package com.hha.heinhtetaung.movies.adapters

import android.content.Context
import android.view.ViewGroup
import com.hha.heinhtetaung.movies.R
import com.hha.heinhtetaung.movies.viewholders.BaseViewHolder
import com.hha.heinhtetaung.movies.viewholders.MovieArtistsViewHolder
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MovieArtistAdapter(context: Context) : BaseRecyclerAdapter<MovieArtistsViewHolder, Objects>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Objects> {
        val artistsItemView = mLayoutInflator.inflate(R.layout.item_artists, parent, false)
        return MovieArtistsViewHolder(artistsItemView)
    }
}