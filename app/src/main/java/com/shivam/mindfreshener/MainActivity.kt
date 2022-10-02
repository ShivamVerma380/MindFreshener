package com.shivam.mindfreshener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide() //safe call

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.meme,"Memes"))
        data.add(ItemsViewModel(R.drawable.news,"News"))
        data.add(ItemsViewModel(R.drawable.music,"Music"))

        //Pass arraylist to adapter
        val adapter = CustomAdapter(data);

        //Setting adapter with recycler view
        recyclerView.adapter = adapter


    }
}