package com.example.hpsus.kotlintestretrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.hpsus.kotlintestretrofit.api.HomeApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    var homes: ArrayList<HModel>? = null
    var recyclerView: RecyclerView? = null
    private var adapter: HomeAdapter? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        homes=ArrayList<HModel>()
        recyclerView = findViewById(R.id.lvHome) as RecyclerView
        layoutManager = LinearLayoutManager(this)
        recyclerView!!.setLayoutManager(layoutManager)



        val retrofit = Retrofit.Builder()
                .baseUrl("https://rawgit.com/Okorokov/kotlinTestRetrofit/master/app/src/main/assets/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        //retrofit.create()
        val homeApi =retrofit.create(HomeApi::class.java)
        val call=homeApi.getData()
        call.enqueue(object:Callback<HomeModel>{
            override fun onFailure(call: Call<HomeModel>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<HomeModel>?, response: Response<HomeModel>?) {
                Log.d("XXXX", response!!.code().toString())
                Log.d("XXXX", response!!.body().getHome()!!.get(0).getnameHome())
                homes= ArrayList(response.body().getHome())
                Log.d("XXXX", homes!!.size.toString())
                val adapter = HomeAdapter(homes!!,applicationContext)
                recyclerView!!.adapter=adapter
                //recyclerView!!.adapter.notifyDataSetChanged()
            }

        })


    }
}
