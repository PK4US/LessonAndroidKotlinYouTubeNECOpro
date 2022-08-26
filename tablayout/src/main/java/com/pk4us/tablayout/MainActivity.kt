package com.pk4us.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.pk4us.tablayout.databinding.ActivityMainBinding
import com.pk4us.tablayout.fragments.MainFragment
import com.pk4us.tablayout.models.MainViewModel

class MainActivity : AppCompatActivity() {
    private val model: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.holder, MainFragment.newInstance()).commit()
    }
}