package com.example.hpsus.kotlintestretrofit.api


import com.example.hpsus.kotlintestretrofit.HomeModel
import retrofit2.Call

import retrofit2.http.GET


interface HomeApi {
    @GET("doc.json")
    fun getData(): Call<HomeModel>
}