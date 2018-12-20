package com.hha.heinhtetaung.movies.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.hha.heinhtetaung.movies.R
import com.hha.heinhtetaung.movies.adapters.MovieArtistAdapter
import com.hha.heinhtetaung.movies.adapters.MovieGenreAdapter
import com.hha.heinhtetaung.movies.adapters.MovieNameAdapter
import com.hha.heinhtetaung.movies.viewholders.MovieGenreViewHolder

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mMovieGenreAdapter: MovieGenreAdapter
    private lateinit var mMovieArtistAdapter: MovieArtistAdapter
    private lateinit var mMovieNameAdapter: MovieNameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)

        mMovieGenreAdapter = MovieGenreAdapter(this)
        rvGenre.adapter = mMovieGenreAdapter
        rvGenre.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        mMovieArtistAdapter = MovieArtistAdapter(this)
        rvArtists.adapter = mMovieArtistAdapter
        rvArtists.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        mMovieNameAdapter = MovieNameAdapter(this)
        rvMovies.adapter = mMovieNameAdapter
        rvMovies.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
