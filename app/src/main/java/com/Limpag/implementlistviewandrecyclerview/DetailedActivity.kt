package com.Limpag.implementlistviewandrecyclerview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.Limpag.implementlistviewandrecyclerview.databinding.ActivityDetailedBinding
class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val desc = intent.getIntExtra("desc", R.string.BirManCat)
            val image = intent.getIntExtra("image", R.drawable.birmancat)
            binding.detailName.text = name
            binding.detailDesc.setText(desc)
            binding.detailImage.setImageResource(image)
        }
        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}