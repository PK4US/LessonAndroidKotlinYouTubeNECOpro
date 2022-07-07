package com.pk4u.pifagorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.pk4u.pifagorapp.databinding.ActivityMainBinding
import java.lang.Math.sqrt
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickResult(view: View){
        if (!isFieldEmpty()){
            val result = getString(R.string.result_info) + getResult()
            binding.tvResult.text = result
        }
    }

    private fun isFieldEmpty():Boolean{
        if (binding.edA.text.isNullOrEmpty() ) binding.edA.error = "Поле должно быть заполнено"
        if (binding.edB.text.isNullOrEmpty()) binding.edB.error = "Поле должно быть заполнено"
        return binding.edA.text.isNullOrEmpty() || binding.edB.text.isNullOrEmpty()
    }

    private fun getResult(): String{
        val a: Double
        val b: Double
        binding.apply {
            a = edA.text.toString().toDouble()
            b = edB.text.toString().toDouble()
        }
        return sqrt((a.pow(2) + b.pow(2))).toString()
    }


}





















//        val edA = findViewById<EditText>(R.id.edA)
//        edA.setOnEditorActionListener{_,actionId, _ ->
//            if (actionId == EditorInfo.IME_ACTION_SEARCH){
//                return@setOnEditorActionListener onClick()
//            }
//            return@setOnEditorActionListener false
//        }
//    }
//
//    private fun onClick(): Boolean {
//       Toast.makeText(this, "done", Toast.LENGTH_SHORT).show()
//        return true