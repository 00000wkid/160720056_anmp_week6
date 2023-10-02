package com.example.a160720056_w4.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.example.a160720056_w4.model.Plane

class PlanesViewModel(application: Application): AndroidViewModel(application){
    val planesLD=MutableLiveData<ArrayList<Plane>>()
    val TAG="volleyTagPlanes"
    private var queue: RequestQueue?=null
    fun refersh(){
        queue= Volley.newRequestQueue(getApplication())
        val url="http://10.0.2.2./planes.json"
        val stringRequest= StringRequest(
            Request.Method.GET,url, {
                val sType=object :TypeToken<ArrayList<Plane>>(){}.type
                val result=Gson().fromJson<ArrayList<Plane>>(it,sType)
                planesLD.value=result as ArrayList<Plane>?
                Log.d("showVolley",it)
            },{
                Log.d("showVolley",it.toString())
            }
        )

}}

