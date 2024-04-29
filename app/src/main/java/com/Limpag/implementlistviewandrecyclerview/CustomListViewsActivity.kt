package com.Limpag.implementlistviewandrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.Limpag.implementlistviewandrecyclerview.databinding.ActivityCustomListViewsBinding

class CustomListViewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCustomListViewsBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomListViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.birmancat,
            R.drawable.bombaycat,
            R.drawable.britishcat,
            R.drawable.norwegiancat,
            R.drawable.scottishcat
        )
        val descList = intArrayOf(
            R.string.BirManCat,
            R.string.Bombaycat,
            R.string.BritishCat,
            R.string.NorwegianCat,
            R.string.ScottishCat
        )
        val nameList = arrayOf("Birdman Cat", "Bombay Cat", "British Cat", "Norwegian Cat", "Scottish Cat",)

        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                descList[i],
                imageList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(this@CustomListViewsActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true
        binding.listview.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@CustomListViewsActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("desc", descList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
        }
        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}

