package com.ismael.movieflexapi.api.tvshow.repository

import com.ismael.movieflexapi.api.tvshow.retrofit.TVShowRetrofitModule
import com.ismael.movieflexpersistence.entity.tv.TVData
import com.ismael.movieflexpersistence.entity.tv.detail.TVDetailData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TVShowRepository : ITVShowRepository {
    var tvRetrofitModulo: TVShowRetrofitModule = TVShowRetrofitModule()

    override fun getPopular(api_key: String?): Observable<TVData>? {
        return tvRetrofitModulo.getPopular()
            .getPopular(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { tvData ->
                return@flatMap Observable.just(tvData)
            }
    }

    override fun getRated(api_key: String?): Observable<TVData>? {
        return tvRetrofitModulo.getRated()
            .getRated(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { tvData ->
                return@flatMap Observable.just(tvData)
            }
    }

    override fun getRecommendation(tv_id: Int, api_key: String?): Observable<TVData>? {
        return tvRetrofitModulo.getRecommendation()
            .getRecommendations(tv_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { tvData ->
                return@flatMap Observable.just(tvData)
            }
    }

    override fun getTVDetail(tv_id: Int, api_key: String?): Observable<TVDetailData>? {
        return tvRetrofitModulo.getTVDetail()
            .getTVDetail(tv_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { tvData ->
                return@flatMap Observable.just(tvData)
            }
    }

}