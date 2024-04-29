package com.Limpag.implementlistviewandrecyclerview

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CustomListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        val listView: ListView = findViewById(R.id.listView)
        val data = arrayOf("car", "plane", "motor", "bus", "train")

        val adapter = CustomAdapter(this, data)
        listView.adapter = adapter
        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            navigateBackToMainActivity()
        }
    }

    private fun navigateBackToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}

