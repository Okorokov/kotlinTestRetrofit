package com.example.hpsus.kotlintestretrofit

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.ArrayList

 class HomeAdapter(private val homes: ArrayList<HModel>,val context: Context) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    //var homes: List<HomeModel>? = ArrayList<HomeModel>()




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false)
        Log.d("XXXX", "onCreateViewHolder")
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val home = homes.get(position)
        Log.d("XXXX", homes.size.toString())
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
