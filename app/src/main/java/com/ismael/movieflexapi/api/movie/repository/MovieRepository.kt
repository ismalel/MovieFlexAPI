package com.ismael.movieflexapi.api.movie.repository

import com.ismael.movieflexapi.api.movie.retrofit.MovieRetrofitModule
import com.ismael.movieflexpersistence.MovieDetailData
import com.ismael.movieflexpersistence.entity.movie.MovieData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MovieRepository : IMovieRepository {
    var movieRetrofitModulo: MovieRetrofitModule = MovieRetrofitModule()

    override fun getPopular(api_key: String?): Observable<MovieData>? {
        return movieRetrofitModulo.getPopular()
            .getPopular(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getRated(api_key: String?): Observable<MovieData>? {
        return movieRetrofitModulo.getRated()
            .getRated(api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getRecommendation(movie_id: Int, api_key: String?): Observable<MovieData>? {
        return movieRetrofitModulo.getRecommendation()
            .getRecommendations(movie_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }

    override fun getMovieDetail(movie_id: Int, api_key: String?): Observable<MovieDetailData>? {
        return movieRetrofitModulo.getMovieDetail()
            .getMovieDetail(movie_id,api_key)
            .subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.flatMap { movieData ->
                return@flatMap Observable.just(movieData)
            }
    }
}