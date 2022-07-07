package com.pk4u.kotlinfishermenhandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav_view = findViewById<NavigationView>(R.id.nav_view)
        nav_view.setNavigationItemSelectedListener (this)


        val rcView = findViewById<RecyclerView>(R.id.rcView)
        var list = ArrayList<ListItem>()
        list.add(ListItem(R.drawable.som,"Сом","Обыкнове́нный сом, или европейский сом — крупная пресноводная бесчешуйчатая рыба семейства сомовых. Длина тела до 5 м, масса до 400 кг. Л. П. Сабанеев приводит сведения Кесслера о поимке сомов массой более 300 кг в XIX веке, в Днепре, Днестре и Одере."))
        list.add(ListItem(R.drawable.karas,"Карась","Караси — неприхотливые промысловые рыбы, и ценный объект прудового хозяйства благодаря способности выживать при низком (до 2-3 мг/л) содержании кислорода в воде."))
        list.add(ListItem(R.drawable.shuka,"Щука","Щу́ка, или обыкнове́нная щу́ка, — рыба семейства щуковых. Распространена в пресных водах Евразии и Северной Америки. Живёт обычно в прибрежной зоне, в водных зарослях, в непроточных или слабопроточных водах."))
        list.add(ListItem(R.drawable.bichek,"Налим","Темя, затылок, спина, жаберные крышки (на треть), основания грудных плавников, задняя половина горла и брюхо покрыты циклоидной чешуёй. Второй спинной плавник значительно снижается до заднего конца тела."))

        rcView.hasFixedSize()
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = MyAdapter(list,this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.id_fish -> Toast.makeText(this,"id_fish",Toast.LENGTH_SHORT).show()
            R.id.id_na -> Toast.makeText(this,"id_na",Toast.LENGTH_SHORT).show()
            R.id.id_sna -> Toast.makeText(this,"id_sna",Toast.LENGTH_SHORT).show()
            R.id.id_history -> Toast.makeText(this,"id_history",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}