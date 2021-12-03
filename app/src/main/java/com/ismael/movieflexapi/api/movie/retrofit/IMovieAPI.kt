package com.ismael.movieflexapi.api.movie.retrofit

import com.ismael.movieflexpersistence.MovieDetailData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import com.ismael.movieflexpersistence.entity.movie.MovieData
import retrofit2.http.Path

interface IMovieAPI {

    interface Popular{
        @GET("movie/popular")
        fun getPopular(@Query("api_key") api_key: String?) : Observable<MovieData>
    }

    interface Rated{
        @GET("movie/top_rated")
        fun getRated(@Query("api_key") api_key: String?) : Observable<MovieData>
    }

    interface Recommendation{
        @GET("movie/{movie_id}/recommendations")
        fun getRecommendations(@Path("movie_id") movie_id : Int,
                               @Query("api_key") api_key: String?) : Observable<MovieData>
    }

    interface Detail{
        @GET("movie/{movie_id}")
        fun getMovieDetail(@Path("movie_id") movie_id: Int,
                           @Query("api_key") api_key: String?) : Observable<MovieDetailData>
    }
}