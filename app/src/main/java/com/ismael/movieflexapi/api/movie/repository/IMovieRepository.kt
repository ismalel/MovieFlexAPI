package com.ismael.movieflexapi.api.movie.repository

import com.ismael.movieflexpersistence.MovieDetailData
import com.ismael.movieflexpersistence.entity.movie.MovieData
import io.reactivex.Observable

interface IMovieRepository {

    fun getPopular(api_key : String?) : Observable<MovieData>?
    fun getRated(api_key : String?) : Observable<MovieData>?
    fun getRecommendation(movie_id : Int, api_key: String?) : Observable<MovieData>?
    fun getMovieDetail(movie_id : Int, api_key: String?) : Observable<MovieDetailData>?

}