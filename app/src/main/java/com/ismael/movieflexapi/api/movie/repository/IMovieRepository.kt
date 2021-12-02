package com.ismael.movieflexapi.api.movie.repository

import com.ismael.movieflexpersistence.entity.base.Data
import io.reactivex.Observable

interface IMovieRepository {

    fun getPopular(api_key : String?) : Observable<Data>?
    fun getRated(api_key : String?) : Observable<Data>?
    fun getRecommendation(movie_id : Int, api_key: String?) : Observable<Data>?

}