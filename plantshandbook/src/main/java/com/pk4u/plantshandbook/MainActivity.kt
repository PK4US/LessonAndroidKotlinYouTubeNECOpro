package com.pk4u.plantshandbook

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.pk4u.plantshandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , PlantAdapter.Listener{
    private lateinit var binding:ActivityMainBinding
    private val adapter = PlantAdapter(this)
    private var editLauncher:ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        editLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == RESULT_OK){
                adapter.addPlant(it.data?.getSerializableExtra("plant")as Plant)
            }
        }
    }

    private fun init() = with(binding){
        rcView.layoutManager = GridLayoutManager(this@MainActivity,3)
        rcView.adapter = adapter
        buttonAdd.setOnClickListener(){
            editLauncher?.launch(Intent(this@MainActivity,EditActivity::class.java))
        }
    }

    override fun onClick(plant: Plant) {
    startActivity(Intent(this,ContentActivity::class.java).apply {
        putExtra(ITEM,plant)
    })
    }
}