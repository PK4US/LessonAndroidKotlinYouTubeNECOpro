package com.pk4u.activity_intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import com.pk4u.activity_intent.constance.Constance
import com.pk4u.activity_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var surname: String = "empty"
    private var patronymic: String = "empty"

    private var avatarImageId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    var launcherSignIn =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val l = result.data?.getStringExtra(Constance.LOGIN)
                val p = result.data?.getStringExtra(Constance.LOGIN)

                if (login == l && password == p){
                    binding.ivAvatar.visibility = View.VISIBLE
                    binding.ivAvatar.setImageResource(avatarImageId)
                    val textInfo = "$name $surname $patronymic"
                    binding.tvInfo.text = textInfo
                } else{
                    binding.tvInfo.text = "Такого аккаунта не существует"
                    binding.ivAvatar.visibility = View.VISIBLE
                    binding.ivAvatar.setImageResource(R.drawable.ic__no_avatar)
                }
            }
        }

    var launcherSignUp =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                login = result.data?.getStringExtra(Constance.LOGIN)!!
                password = result.data?.getStringExtra(Constance.PASSWORD)!!
                name = result.data?.getStringExtra(Constance.NAME)!!
                surname = result.data?.getStringExtra(Constance.SURNAME)!!
                patronymic = result.data?.getStringExtra(Constance.PATRONYMIC)!!
                avatarImageId = result.data?.getIntExtra(Constance.AVATAR_ID,0)!!

                binding.ivAvatar.visibility = View.VISIBLE
                binding.ivAvatar.setImageResource(avatarImageId)
                val textInfo = "$name $surname $patronymic"
                binding.tvInfo.text = textInfo
                binding.buttonSignUp.visibility = View.GONE
                binding.buttonSignIn.text = "Выйти"
            }
        }

    fun onClickSignIn(view: View) {
        if (binding.ivAvatar.isVisible){
            binding.ivAvatar.visibility = View.INVISIBLE
            binding.tvInfo.text = ""
            binding.buttonSignUp.visibility = View.VISIBLE
            binding.buttonSignIn.text = getString(R.string.sign_in)
        }else{
            val intent = Intent(this,SignUP::class.java)
            intent.putExtra(Constance.SIGN_STATE,Constance.SIGN_IN_STATE)
            launcherSignIn.launch(intent)
        }
    }

    fun onClickSignUp(view: View) {
        val intent = Intent(this,SignUP::class.java)
        intent.putExtra(Constance.SIGN_STATE,Constance.SIGN_UP_STATE)
        launcherSignUp.launch(intent)
    }
}