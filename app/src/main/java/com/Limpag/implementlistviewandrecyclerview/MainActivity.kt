package com.Limpag.implementlistviewandrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleListViewButton: Button = findViewById(R.id.simpleListViewButton)
        val customListViewButton: Button = findViewById(R.id.customListViewButton)
        val customListViewsButton: Button = findViewById(R.id.anotherCustomListViewButton)
        val recyclerViewButton: Button = findViewById(R.id.recyclerViewButton)
        val recyclerViewButton2: Button = findViewById(R.id.recyclerViewButton2)

        simpleListViewButton.setOnClickListener {
            startActivity(Intent(this, SimpleListViewActivity::class.java))
        }


        customListViewButton.setOnClickListener {
            startActivity(Intent(this, CustomListViewActivity::class.java))
        }
        customListViewsButton.setOnClickListener {
            startActivity(Intent(this, CustomListViewsActivity::class.java))
        }

        recyclerViewButton.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
        recyclerViewButton2.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity2::class.java))
        }
    }
}
