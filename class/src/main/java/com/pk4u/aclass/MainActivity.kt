package com.pk4u.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = User("Eugene","Stepanchuk",25)
        var user2 = User("Sergey","Stepanchuk",23)
        var user3 = User("Sergey","efw",24)
        user3.addAge(1)
        user2.id = "4fdfgef55"
        user2.name = "Andrey"

        user.printLogD()
        user2.printLogD()
        user3.printLogD()

        Log.d("MyLog",user.addAge())
    }
}