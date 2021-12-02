package com.ismael.movieflexapi.api.tvshow.repository

import com.ismael.movieflexapi.api.movie.retrofit.MovieRetrofitModule
import com.ismael.movieflexapi.api.tvshow.retrofit.TVShowRetrofitModule
import com.ismael.movieflexpersistence.DetailData
import com.ismael.movieflexpersistence.entity.movie.MovieData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TVShowRepository : ITVShowRepository {
    var tvRetrofitModulo: TVShowRetrofitModule = TVShowRetrofitModule()

    override fun getPopular(api_key: String?): Observable<MovieData>? {
        return tvRetrofitModulo.getPopular()
            .getPopular(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getRated(api_key: String?): Observable<MovieData>? {
        return tvRetrofitModulo.getRated()
            .getRated(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getRecommendation(tv_id: Int, api_key: String?): Observable<MovieData>? {
        return tvRetrofitModulo.getRecommendation()
            .getRecommendations(tv_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getTVDetail(tv_id: Int, api_key: String?): Observable<DetailData>? {
        return tvRetrofitModulo.getTVDetail()
            .getTVDetail(tv_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

}