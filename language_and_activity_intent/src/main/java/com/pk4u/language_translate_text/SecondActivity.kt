package com.pk4u.language_translate_text

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.pk4u.language_translate_text.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    private var launcher : ActivityResultLauncher<Intent>? = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickBackToFirstActivity(view: View) {
        finish()
    }
    fun onClickToThirdActivity(view: View) {
        val data = binding.etSecondActivity?.text.toString()

        val i = Intent(this, ThirdActivity::class.java)
        i.putExtra("key", data)
        setResult(RESULT_OK,i)
        startActivity(i)
    }
}