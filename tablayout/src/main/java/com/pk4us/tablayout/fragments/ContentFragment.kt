package com.pk4us.tablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.pk4us.tablayout.adapters.VpAdapter
import com.pk4us.tablayout.databinding.ContentFragmentBinding
import com.pk4us.tablayout.models.MainViewModel


class ContentFragment : Fragment() {
    private lateinit var binding : ContentFragmentBinding
    private val list = listOf(InfoFragment.newInstance(), UseCaseFragment.newInstance())
    private val listTitles = listOf("Описание","Применение")
    private val model: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = ContentFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.plant.observe(viewLifecycleOwner){
            binding.iMain.setImageResource(it.imageId)
        }
        val adapter = VpAdapter(activity as AppCompatActivity,list)
        binding.vp2.adapter = adapter

        TabLayoutMediator(binding.tb,binding.vp2){
                tab,pos -> tab.text = listTitles[pos]
        }.attach()
    }

    companion object {
        fun newInstance() = ContentFragment()
    }
}