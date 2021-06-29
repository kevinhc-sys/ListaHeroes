package com.example.listaheroes

import android.graphics.drawable.DrawableContainer
import android.os.Bundle
import android.provider.CalendarContract
import android.view.AbsSavedState
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.listaheroes.databinding.ActivityMainBinding
import com.example.listaheroes.databinding.ItemSuperheroeBinding
import com.squareup.picasso.Picasso


import okio.Utf8.size
import java.nio.file.Files.size
import kotlin.contracts.Returns

/*private var _binding:ActivityMainBinding?=null
private val  binding get() = _binding!!

override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,saveInstanceState: Bundle?):View?{
    _binding= ActivityMainBinding.inflate(inflater,container,false)
    return binding.root

}*/

class HeroAdapter(val superHeroe: List<SuperHeroes>) :
    RecyclerView.Adapter<HeroAdapter.HeroHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superheroe, parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHeroe[position])
    }

    override fun getItemCount(): Int = superHeroe.size

    class HeroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemSuperheroeBinding.bind(view)
        fun render(superHeroe: SuperHeroes) {
            binding.tvRealName.text = superHeroe.nombreReal
            binding.tvNombreHeroe.text = superHeroe.nombreheroe
            binding.tvPublisher.text = superHeroe.publisher
            Picasso.get().load(superHeroe.imagen).into(binding.iwHero)
            view.setOnClickListener {
                Toast.makeText(
                    view.context,
                    "has seleccionado a ${superHeroe.nombreheroe}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }
}