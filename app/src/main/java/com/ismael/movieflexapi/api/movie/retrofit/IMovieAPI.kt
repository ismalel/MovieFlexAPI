package com.ismael.movieflexapi.api.movie.retrofit

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

import com.ismael.movieflexpersistence.entity.base.Data
import retrofit2.http.Path

interface IMovieAPI {

    interface Popular{
        @GET("movie/popular")
        fun getPopular(@Query("api_key") api_key: String?) : Observable<Data>
    }

    interface Rated{
        @GET("movie/top_rated")
        fun getRated(@Query("api_key") api_key: String?) : Observable<Data>
    }

    interface Recommendation{
        @GET("movie")
        fun getRecommendations(@Path("movie_id") movie_id : Int,
                               @Query("api_key") api_key: String?) : Observable<Data>
    }
}