package com.example.hpsus.kotlintestretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import android.R.attr.data




/*помог сайт http://www.jsonschema2pojo.org*/
class HomeModel {
    @SerializedName("data")
    @Expose
    private var data: DataModel? = null
    @SerializedName("home")
    @Expose
    private var home: List<HModel>? = null
    @SerializedName("apartment")
    @Expose
    private var apartment: List<AModel>? = null

    fun getData(): DataModel? {
        return data
    }

    fun setData(data: DataModel) {
        this.data = data
    }

    fun getHome(): List<HModel>? {
        return home
    }

    fun setHome(home: List<HModel>) {
        this.home = home
    }

    fun getApartment(): List<AModel>? {
        return apartment
    }

    fun setApartment(apartment: List<AModel>) {
        this.apartment = apartment
    }
}