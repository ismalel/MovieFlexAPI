package com.ismael.movieflexapi.api.tvshow.retrofit

import com.ismael.movieflexapi.api.movie.retrofit.IMovieAPI
import com.ismael.movieflexapi.client.RetrofitClient

class TVShowRetrofitModule {

    fun getPopular() : ITVShowAPI.Popular{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(ITVShowAPI.Popular::class.java)
    }

    fun getRated() : ITVShowAPI.Rated{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(ITVShowAPI.Rated::class.java)

    }

    fun getRecommendation() : ITVShowAPI.Recommendation{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(ITVShowAPI.Recommendation::class.java)
    }

    fun getTVDetail(): ITVShowAPI.Detail{
        return RetrofitClient().getRetrofitInstance(RetrofitClient().getURLApi())!!.create(ITVShowAPI.Detail::class.java)
    }
}