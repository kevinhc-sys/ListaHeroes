package com.example.listaheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listaheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var superHeros: List<SuperHeroes> = listOf(
        SuperHeroes(
            "Spiderman",
            "Marvel",
            "Peter Parker",
            "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
        ),
        SuperHeroes(
            "Daredevil",
            "Marvel",
            "Matthew Michael Murdock",
            "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
        ),
        SuperHeroes(
            "Wolverine",
            "Marvel",
            "James Howlett",
            "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
        ),
        SuperHeroes(
            "Batman",
            "DC",
            "Bruce Wayne",
            "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
        ),
        SuperHeroes(
            "Thor",
            "Marvel",
            "Thor Odinson",
            "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
        ),
        SuperHeroes(
            "Flash",
            "DC",
            "Jay Garrick",
            "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"
        ),
        SuperHeroes(
            "Green Lantern",
            "DC",
            "Alan Scott",
            "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
        ),
        SuperHeroes(
            "Wonder Woman",
            "DC",
            "Princess Diana",
            "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
        ),
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initRecycler()
    }

    fun initRecycler() {
        binding.rvHeroe.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superHeros)
        binding.rvHeroe.adapter = adapter
    }


}