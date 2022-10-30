package com.example.sampleretrofit.Network

import com.squareup.moshi.Json
data class Character (

    val name:String,
    val image:String
        )


//This is going to return our list of characters
data class CharacterResponse(@Json(name="results")
val result:List<com.example.sampleretrofit.Network.Character>
)
