package com.pk4u.language_translate_text

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pk4u.language_translate_text.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickToSecondActivity(view: View) {
        val i = Intent(this, SecondActivity::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.english -> {
                Toast.makeText(applicationContext, "english", Toast.LENGTH_LONG).show()
                true
            }
            R.id.ukraine -> {
                Toast.makeText(applicationContext, "english", Toast.LENGTH_LONG).show()
                true
            }
            R.id.russian -> {
                Toast.makeText(applicationContext, "russian", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

//    fun setLocale(activity: Activity, languageCode: String?) {
//        val locale = Locale(languageCode)
//        Locale.setDefault(locale)
//        val resources: Resources = activity.resources
//        val config: Configuration = resources.getConfiguration()
//        config.setLocale(locale)
//        resources.updateConfiguration(config, resources.getDisplayMetrics())
//    }
}