package com.ismael.movieflexapi.api.tvshow.retrofit

import com.ismael.movieflexpersistence.entity.tv.TVData
import com.ismael.movieflexpersistence.entity.tv.detail.TVDetailData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ITVShowAPI {

    interface Popular{
        @GET("tv/popular")
        fun getPopular(@Query("api_key") api_key: String?) : Observable<TVData>
    }

    interface Rated{
        @GET("tv/top_rated")
        fun getRated(@Query("api_key") api_key: String?) : Observable<TVData>
    }

    interface Recommendation{
        @GET("tv/{tv_id}/recommendations")
        fun getRecommendations(@Path("tv_id") tv_id : Int,
                               @Query("api_key") api_key: String?) : Observable<TVData>
    }

    interface Detail{
        @GET("tv/{tv_id}")
        fun getTVDetail(@Path("tv_id") movie_id: Int,
                           @Query("api_key") api_key: String?) : Observable<TVDetailData>
    }
}