package com.ismael.movieflexapi.interactor

import android.annotation.SuppressLint
import android.util.Log
import com.ismael.movieflexapi.api.movie.repository.IMovieRepository
import com.ismael.movieflexapi.api.movie.repository.MovieRepository
import com.ismael.movieflexpersistence.entity.base.Data

class MovieInteractor(val movie: IMovieInteractor.Movie): IMovieInteractor.Interactor {
    val movieRepository : IMovieRepository = MovieRepository()

    @SuppressLint("CheckResult")
    override fun getPopular(api_key: String?) {
        movieRepository.getPopular(api_key)
            ?.subscribe({ movieData->
                movie.setPopularMovie(movieData)
            }){ throwable: Throwable->
                Log.i("ASD", throwable.message.toString())
            }
    }

    override fun getRated(api_key: String?) {
        TODO("Not yet implemented")
    }

    override fun getRecommendation(movie_id: Int, api_key: String?) {
        TODO("Not yet implemented")
    }

}