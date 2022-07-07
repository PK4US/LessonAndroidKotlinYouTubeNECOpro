package com.pk4u.menu_toolbar

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import com.pk4u.menu_toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Admin"
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }

        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.search -> {
                Toast.makeText(applicationContext, "search", Toast.LENGTH_LONG).show()
                true
            }
            R.id.sync -> {
                binding.mainActivity.setBackgroundColor(Color.WHITE)
                true
            }
            R.id.aa -> {
                Toast.makeText(applicationContext, "aa", Toast.LENGTH_LONG).show()
                true
            }
            R.id.bb -> {
                item.setIcon(R.drawable.ic_star)
                true
            }
            R.id.cc -> {
                Toast.makeText(applicationContext, "Изменить цвет", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.dd -> {
                Toast.makeText(applicationContext, "dd", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.ee -> {
                return true
            }
            R.id.ff -> {
                item.isChecked = !item.isChecked
                Toast.makeText(applicationContext, "click on ff", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.gg -> {
                item.isChecked = !item.isChecked
                Toast.makeText(applicationContext, "click on gg", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.hh -> {
                item.isChecked = !item.isChecked
                binding.mainActivity.setBackgroundColor(Color.WHITE)
                return true
            }
            R.id.jj -> {
                item.isChecked = !item.isChecked
                binding.mainActivity.setBackgroundColor(Color.YELLOW)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.green ->
                    if (checked) {
                        binding.mainActivity.setBackgroundColor(Color.GREEN)
                    }
                R.id.red ->
                    if (checked) {
                        binding.mainActivity.setBackgroundColor(Color.RED)
                    }
            }
        }
    }
}