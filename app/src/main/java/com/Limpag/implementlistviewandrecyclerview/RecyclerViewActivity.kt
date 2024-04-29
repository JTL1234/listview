package com.Limpag.implementlistviewandrecyclerview

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val data = arrayOf("john", "natash", "leir", "niore", "ash")

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewAdapter(this, data)
        val backButton: Button = findViewById(R.id.backrecylerbutton)
        backButton.setOnClickListener {
            navigateBackToMainActivity()
        }
    }

    private fun navigateBackToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
