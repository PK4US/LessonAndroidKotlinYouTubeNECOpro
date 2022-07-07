package com.pk4u.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pk4u.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bNuv.selectedItemId = R.id.item3 // выбрать кнопку по умолчанию
        binding.bNuv.setOnItemSelectedListener {
            when (it.itemId){
                R.id.item1 -> {Toast.makeText(this,"item 1",Toast.LENGTH_SHORT).show()}
                R.id.item2 -> {Toast.makeText(this,"item 2",Toast.LENGTH_SHORT).show()}
                R.id.item3 -> {Toast.makeText(this,"item 3",Toast.LENGTH_SHORT).show()}
                R.id.item4 -> {Toast.makeText(this,"item 4",Toast.LENGTH_SHORT).show()}
            }
            true }
    }
}