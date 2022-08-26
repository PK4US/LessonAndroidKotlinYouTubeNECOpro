package com.pk4us.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.pk4us.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val list = listOf(Fragment1.newInstance(),Fragment2.newInstance(),Fragment3.newInstance())
    private val listTitles = listOf("item 1","item 2","item 3",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = VpAdapter(this,list)
        binding.vp2.adapter = adapter

        TabLayoutMediator(binding.tb,binding.vp2){
            tab,pos -> tab.text = listTitles[pos]
        }.attach()
    }
}