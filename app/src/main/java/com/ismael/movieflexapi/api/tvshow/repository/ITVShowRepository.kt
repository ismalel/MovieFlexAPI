package com.ismael.movieflexapi.api.tvshow.repository

import com.ismael.movieflexpersistence.entity.tv.TVData
import com.ismael.movieflexpersistence.entity.tv.detail.TVDetailData
import io.reactivex.Observable

interface ITVShowRepository {

    fun getPopular(api_key : String?) : Observable<TVData>?
    fun getRated(api_key : String?) : Observable<TVData>?
    fun getRecommendation(tv_id : Int, api_key: String?) : Observable<TVData>?
    fun getTVDetail(tv_id : Int, api_key: String?) : Observable<TVDetailData>?

}