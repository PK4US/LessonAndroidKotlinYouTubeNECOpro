package com.pk4u.plantshandbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pk4u.plantshandbook.databinding.PlantItemBinding

class PlantAdapter(private val listener:Listener) : RecyclerView.Adapter<PlantAdapter.PlantHolder>() {
    private val plantList = ArrayList<Plant>()
    class PlantHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = PlantItemBinding.bind(item)
        fun bind(plant: Plant,listener: Listener) = with(binding) {
            im.setImageResource(plant.imageId)
            tvTitle.text = plant.title
            itemView.setOnClickListener {
                listener.onClick(plant)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item,parent,false)
        return PlantHolder(view)

    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        holder.bind(plantList[position],listener)
    }

    override fun getItemCount(): Int {
        return plantList.size
    }

    fun addPlant(plant:Plant){
        plantList.add(plant)
        notifyDataSetChanged()
    }

    interface Listener{
        fun onClick(plant:Plant)
    }
}
