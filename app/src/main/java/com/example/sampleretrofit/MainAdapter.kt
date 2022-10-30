package com.example.sampleretrofit

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.sampleretrofit.Network.Character

class MainAdapter(val charactersList: List<com.example.sampleretrofit.Network.Character>)
    : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(charactersList[position])
    }

    override fun getItemCount(): Int {
        return charactersList.size
    }
}

class MainViewHolder(private val itemView:View):RecyclerView.ViewHolder(itemView){
    fun bind(character: Character){
        val name= itemView.findViewById<TextView>(R.id.name)
        val image= itemView.findViewById<ImageView>(R.id.image)
//map our data to our xml resources
        name.text=character.name
        //we load the image and call coil
        image.load(character.image){
            //we define it to be circlular
            transformations(CircleCropTransformation())
        }

    }

}