package com.ismael.movieflexapi.api.movie.retrofit

import com.ismael.movieflexapi.client.RetrofitClient

class MovieRetrofitModule {

    fun getPopular() : IMovieAPI.Popular{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(IMovieAPI.Popular::class.java)
    }

    fun getRated() : IMovieAPI.Rated{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(IMovieAPI.Rated::class.java)

    }

    fun getRecommendation() : IMovieAPI.Recommendation{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(IMovieAPI.Recommendation::class.java)
    }

    fun getMovieDetail(): IMovieAPI.Detail{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(IMovieAPI.Detail::class.java)
    }
}