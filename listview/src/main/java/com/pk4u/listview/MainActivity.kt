package com.pk4u.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameList = ArrayList<String>()
        nameList.add("Андрей")
        nameList.add("Александр")
        nameList.add("Михаил")
        nameList.add("Вася")
        nameList.add("Денис")
        nameList.add("Ростик")
        nameList.add("Серьгей")
        nameList.add("Владик")
        nameList.add("Женя")
        nameList.add("Никита")
        nameList.add("Максим")
        nameList.add("Виктор")
        nameList.add("Иван")
        nameList.add("Владимир")
        nameList.add("Данил")
        nameList.add("Дима")
        nameList.add("Генадий")
        nameList.add("Герман")
        nameList.add("Артем")

        val listView: ListView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nameList)
        listView.adapter = adapter

        listView.setOnItemClickListener{parent,viw,position,id ->
            Toast.makeText(this,"Pressed item position: ${nameList.get(position)}",Toast.LENGTH_SHORT).show()
        }
    }
}