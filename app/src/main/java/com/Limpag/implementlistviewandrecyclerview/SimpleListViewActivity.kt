package com.Limpag.implementlistviewandrecyclerview

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SimpleListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)

        val listView: ListView = findViewById(R.id.listView)
        val data = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
            animateListItem(view)
            // Handle item click here if needed
        }
        val backButton: Button = findViewById(R.id.backsimplebutton)
        backButton.setOnClickListener {
            navigateBackToMainActivity()
        }
    }

    private fun navigateBackToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
    private fun animateListItem(view: View) {
        val colorFrom = Color.WHITE
        val colorTo = Color.parseColor("#FFFF00") // Change to desired color
        val duration = 500L // Duration of the animation in milliseconds

        val animator = ObjectAnimator.ofObject(
            view, "backgroundColor", ArgbEvaluator(), colorFrom, colorTo
        )
        animator.duration = duration
        animator.repeatCount = 1
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.start()
    }
}
