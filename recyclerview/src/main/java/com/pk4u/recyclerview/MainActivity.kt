package com.pk4u.recyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.pk4u.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = PlantAdapter()
    private val imageIdList = listOf(
        R.drawable.plant_1,
        R.drawable.plant_2,
        R.drawable.plant_3,
        R.drawable.plant_4,)
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        Log.d("MyLog","done")

    }

    private fun init() = with(binding){
        rcView.layoutManager = GridLayoutManager(this@MainActivity,3)
        rcView.adapter = adapter
        buttonAdd.setOnClickListener(){
            if (index>3) index = 0
            val plant = Plant(imageIdList[index] ,"Plant $index")
            adapter.addPlant(plant)
            index++
        }
    }
}