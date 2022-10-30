package com.example.sampleretrofit.Network

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query



interface ApiService {

    /**create a fetch methodn and annotate it with @GET passing the character path just like in the Apilink

     */

    @GET( "Character")
    fun fetchCharacters(@Query("page")page:String):retrofit2.Call<CharacterResponse>
}