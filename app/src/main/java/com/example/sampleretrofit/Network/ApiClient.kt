package com.example.sampleretrofit.Network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiClient {
//This is the source URL variable
    val BASEURL= "https://rickandmortyapi.com/api/"
//Create a variable for the moshi builder
    val moshi =Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    //create a retrofit instance by lazy so that it can initialize only when its ready
    //pass the base url and moshi variables created above
    private val retrofit:Retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()

    }
    //create a refrence variable for our Apiservice so as to create an APISevice
    val apiService:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}
