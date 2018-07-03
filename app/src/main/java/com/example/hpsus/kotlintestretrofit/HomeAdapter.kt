package com.example.hpsus.kotlintestretrofit

import android.os.Build
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.ArrayList

class HomeAdapter(val homes: HomeModel) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    //var homes: List<HomeModel>? = ArrayList<HomeModel>()




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val home = homes.getHome()!!.get(position)

        holder.tvHome.text = home.getnameHome()

    }

    override fun getItemCount(): Int {
        return 0
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHome: TextView


        init {
            tvHome = itemView.findViewById(R.id.tvHome) as TextView

        }
    }
}
