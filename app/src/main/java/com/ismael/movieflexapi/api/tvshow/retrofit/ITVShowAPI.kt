package com.ismael.movieflexapi.api.tvshow.retrofit

import com.ismael.movieflexpersistence.DetailData
import com.ismael.movieflexpersistence.entity.movie.MovieData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ITVShowAPI {

    interface Popular{
        @GET("tv/popular")
        fun getPopular(@Query("api_key") api_key: String?) : Observable<MovieData>
    }

    interface Rated{
        @GET("tv/top_rated")
        fun getRated(@Query("api_key") api_key: String?) : Observable<MovieData>
    }

    interface Recommendation{
        @GET("tv/{tv_id}/recommendations")
        fun getRecommendations(@Path("tv_id") tv_id : Int,
                               @Query("api_key") api_key: String?) : Observable<MovieData>
    }

    interface Detail{
        @GET("tv/{tv_id}")
        fun getTVDetail(@Path("tv_id") movie_id: Int,
                           @Query("api_key") api_key: String?) : Observable<DetailData>
    }
}