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
    private var home: List<Home>? = null
    @SerializedName("apartment")
    @Expose
    private var apartment: List<Apartment>? = null

    fun getData(): DataModel? {
        return data
    }

    fun setData(data: DataModel) {
        this.data = data
    }

    fun getHome(): List<Home>? {
        return home
    }

    fun setHome(home: List<Home>) {
        this.home = home
    }

    fun getApartment(): List<Apartment>? {
        return apartment
    }

    fun setApartment(apartment: List<Apartment>) {
        this.apartment = apartment
    }
}