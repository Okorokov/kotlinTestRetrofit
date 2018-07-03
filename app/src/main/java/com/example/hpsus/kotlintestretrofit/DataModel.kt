package com.example.hpsus.kotlintestretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DataModel {
    @SerializedName("vers")
    @Expose
    private var vers: Int? = null

    fun getVers(): Int? {
        return vers
    }

    fun setVers(vers: Int?) {
        this.vers = vers
    }
}