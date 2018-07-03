package com.example.hpsus.kotlintestretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName




class HModel {
    @SerializedName("indiHome")
    @Expose
    private var indiHome: Int? = null

    @SerializedName("nameHome")
    @Expose
    private var nameHome: String? = null

    @SerializedName("floors")
    @Expose
    private var floors: Int? = null

    @SerializedName("developerName")
    @Expose
    private var developerName: String? = null

    fun getIndiHome(): Int? {
        return indiHome
    }

    fun setIndiHome(indiHome: Int?) {
        this.indiHome = indiHome
    }

    fun getnameHome(): String? {
        return nameHome
    }

    fun setnameHome(nameHome: String?) {
        this.nameHome = nameHome
    }

    fun getFloors(): Int? {
        return floors
    }

    fun setFloors(floors: Int?) {
        this.floors = floors
    }

    fun getDeveloperName(): String? {
        return developerName
    }

    fun setDeveloperName(developerName: String?) {
        this.developerName = developerName
    }
}