package com.pk4u.plantshandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pk4u.plantshandbook.databinding.ActivityContentBinding
import com.pk4u.plantshandbook.databinding.ActivityEditBinding
import com.pk4u.plantshandbook.databinding.ActivityMainBinding
const val ITEM = "item"
class ContentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getSerializableExtra(ITEM) as Plant
        binding.apply {
            imMain.setImageResource(item.imageId)
            tvTitle.text = item.title
            tvContent.text = item.desc

        }
    }
}