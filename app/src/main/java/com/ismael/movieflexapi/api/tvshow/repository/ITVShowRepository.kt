package com.ismael.movieflexapi.api.tvshow.repository

import com.ismael.movieflexpersistence.DetailData
import com.ismael.movieflexpersistence.entity.movie.MovieData
import io.reactivex.Observable

interface ITVShowRepository {

    fun getPopular(api_key : String?) : Observable<MovieData>?
    fun getRated(api_key : String?) : Observable<MovieData>?
    fun getRecommendation(tv_id : Int, api_key: String?) : Observable<MovieData>?
    fun getTVDetail(tv_id : Int, api_key: String?) : Observable<DetailData>?

}