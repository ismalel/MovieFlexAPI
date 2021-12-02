package com.ismael.movieflexapi.api.movie.repository

import com.ismael.movieflexapi.api.movie.retrofit.MovieRetrofitModule
import com.ismael.movieflexpersistence.entity.base.Data
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.Exception

class MovieRepository : IMovieRepository {
    var movieRetrofitModulo: MovieRetrofitModule = MovieRetrofitModule()

    override fun getPopular(api_key: String?): Observable<Data>? {
        return movieRetrofitModulo.getPopular()
            .getPopular(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getRated(api_key: String?): Observable<Data>? {
        return movieRetrofitModulo.getRated()
            .getRated(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getRecommendation(movie_id: Int, api_key: String?): Observable<Data>? {
        return movieRetrofitModulo.getRecommendation()
            .getRecommendations(movie_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }
}