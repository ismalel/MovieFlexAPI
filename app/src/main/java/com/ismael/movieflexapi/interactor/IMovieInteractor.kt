package com.ismael.movieflexapi.interactor

import com.ismael.movieflexpersistence.entity.base.Data

interface IMovieInteractor {

    interface Movie{
        fun getPopularMovie(api_key: String?)
        fun setPopularMovie(data: Data)
        fun getTopRatedMovie(api_key: String?)
        fun setTopRatedMovie(data: Data)
        fun getMovieRecommendation(movie_id : Int,api_key: String?)
        fun setMovieRecommendation(data: Data)
    }

    interface Interactor{
        fun getPopular(api_key: String?)
        fun getRated(api_key: String?)
        fun getRecommendation(movie_id: Int, api_key: String?)

    }
}