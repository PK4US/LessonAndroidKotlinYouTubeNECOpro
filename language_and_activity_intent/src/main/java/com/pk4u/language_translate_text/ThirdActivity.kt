package com.pk4u.language_translate_text

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pk4u.language_translate_text.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getStringExtra("key")
        binding.tvThirdActivity?.text = data
    }

    fun onClickBackToActivityTwo(view: View) {
        setResult(RESULT_OK)
        finish()
    }
}
