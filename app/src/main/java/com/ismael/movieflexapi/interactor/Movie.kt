package com.ismael.movieflexapi.interactor

import com.ismael.movieflexpersistence.entity.base.Data

class Movie : IMovieInteractor.Movie {
    var data : Data = Data()
    val interactor : IMovieInteractor.Interactor = MovieInteractor( this)

    override fun getPopularMovie(api_key: String?) {
        interactor.getPopular(api_key)
    }

    override fun setPopularMovie(data: Data) {
        this.data = data
    }

    override fun getTopRatedMovie(api_key: String?) {
        interactor.getRated(api_key)
    }

    override fun setTopRatedMovie(data: Data) {
        this.data = data
    }

    override fun getMovieRecommendation(movie_id: Int, api_key: String?) {
        interactor.getRecommendation(movie_id,api_key)
    }

    override fun setMovieRecommendation(data: Data)  {
        this.data = data
    }


}