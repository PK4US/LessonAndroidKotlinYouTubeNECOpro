package com.pk4u.aclass

import android.util.Log


class User(var name:String,var surname:String, var age: Int = 18) {
    var id:String? = null

    fun printLogD(){
        Log.d("MyLog","$name $age $id")
    }

    fun addAge(year: Int = 10):String{
        age = age.plus(year)
        return "Возращаем строку в функции addAge"
    }

    infix fun addSurname(surname: String ){


    }
}