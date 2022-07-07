package com.pk4u.loop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fruitArray = listOf("Яблоко", "Апельсин", "Груша")

        Log.d("MyLog", "Range: ${fruitArray.indices}")
        Log.d("MyLog", "___________________________________")
//_______________________________________________________________________________________________________________________________________
//____________________________________________________FOR________________________________________________________________________________
//_______________________________________________________________________________________________________________________________________
        for(index in fruitArray.indices){ Log.d("MyLog", "Fruit: ${fruitArray[index]} | Fruit position: $index") }
        Log.d("MyLog", "___________________________________")

        for((index, fruit) in fruitArray.withIndex()){ Log.d("MyLog", "Fruit: $fruit | Index: $index ") }
        Log.d("MyLog", "___________________________________")

        for(index in 0..10){ Log.d("MyLog", "Index: $index") }
        Log.d("MyLog", "___________________________________")

        for(index in 10 downTo 3){ Log.d("MyLog", "Index: $index ") }//наоборот
        Log.d("MyLog", "___________________________________")

        for(index in 10 downTo 3 step 2){ Log.d("MyLog", "Index: $index ") }//наоборот с шагом
        Log.d("MyLog", "___________________________________")

        for(letter in 'Z' downTo 'A'){ Log.d("MyLog", "Index: $letter ") }
        Log.d("MyLog", "___________________________________")

        for(index in 1..fruitArray.size - 1){ Log.d("MyLog", "Fruit: ${fruitArray[index]} ") } //от первого до последнего
        Log.d("MyLog", "_______________")
        for(index in 1 until fruitArray.size){ Log.d("MyLog", "Fruit: ${fruitArray[index]} ") } //от первого до последнего правильно
        Log.d("MyLog", "___________________________________")

        for(fruit in fruitArray){ if(fruit == "Апельсин") break //прерывание цикла
            Log.d("MyLog", "Fruit: $fruit") }
        Log.d("MyLog", "___________________________________")

        for(fruit in fruitArray){ if(fruit == "Апельсин") continue //перепрыгнуть одну позицию и продолжить цикл со следующей позиции
            Log.d("MyLog", "Fruit: $fruit") }
        Log.d("MyLog", "___________________________________")

//_______________________________________________________________________________________________________________________________________
//____________________________________________________FOREACH____________________________________________________________________________
//_______________________________________________________________________________________________________________________________________

        fruitArray.forEach { Log.d("MyLog", "Fruit: $it") }// цикл будет по очереди выдавать элементы массива в виде переменной it
        Log.d("MyLog", "___________________________________")

//_______________________________________________________________________________________________________________________________________
//____________________________________________________WHILE______________________________________________________________________________
//_______________________________________________________________________________________________________________________________________

        var index = 0
        while (index < fruitArray.size){
            Log.d("MyLog","Fruit: ${fruitArray[index]}")
            index++
        }
        Log.d("MyLog", "___________________________________")

//_______________________________________________________________________________________________________________________________________
//__________________________________________________DO_WHILE_____________________________________________________________________________
//_______________________________________________________________________________________________________________________________________

        index = 0
        do {
            Log.d("MyLog","Fruit: ${fruitArray[index]}")
            index++
        } while (index < fruitArray.size)
        Log.d("MyLog", "___________________________________")


//_______________________________________________________________________________________________________________________________________
//__________________________________________________ПРАКТИКА_____________________________________________________________________________
//_______________________________________________________________________________________________________________________________________

        val bad = 0..3
        val normal = 4..6
        val nice = 7..9
        val excellent = 10
        val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
        val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
        val badArray = ArrayList<String>()
        val normalArray = ArrayList<String>()
        val niceArray = ArrayList<String>()
        val excellentArray = ArrayList<String>()

        for ((index,name)in nameArray.withIndex()){
            when(gradeArray[index]){
                in bad -> badArray.add("Плохие оценки: Ученик: $name - ${gradeArray[index]}")
                in normal -> badArray.add("Плохие оценки: Ученик: $name - ${gradeArray[index]}")
                in nice -> badArray.add("Плохие оценки: Ученик: $name - ${gradeArray[index]}")
                excellent -> badArray.add("Плохие оценки: Ученик: $name - ${gradeArray[index]}")
            }
        }

        badArray.forEach{Log.d("MyLog",it)}
        normalArray.forEach{Log.d("MyLog",it)}
        niceArray.forEach{Log.d("MyLog",it)}
        excellentArray.forEach{Log.d("MyLog",it)}
    }
}