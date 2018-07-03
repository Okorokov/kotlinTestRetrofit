package com.example.hpsus.kotlintestretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class AModel{
    @SerializedName("indiApartment")
    @Expose
    private var indiApartment: Int? = null

    @SerializedName("indiHome")
    @Expose
    private var indiHome: Int? = null

    @SerializedName("floor")
    @Expose
    private var floor: Int? = null

    @SerializedName("area")
    @Expose
    private var area: Float? = null


    fun getIndiApartment(): Int? {
        return indiApartment
    }

    fun setIndiApartment(indiApartment: Int?) {
        this.indiApartment = indiApartment
    }

    fun getIndiHome(): Int? {
        return indiHome
    }

    fun setIndiHome(indiHome: Int?) {
        this.indiHome = indiHome
    }

    fun getFloor(): Int? {
        return floor
    }

    fun setFloor(floor: Int?) {
        this.floor = floor
    }

    fun getArea(): Float? {
        return area
    }

    fun setArea(area: Float?) {
        this.area = area
    }
}