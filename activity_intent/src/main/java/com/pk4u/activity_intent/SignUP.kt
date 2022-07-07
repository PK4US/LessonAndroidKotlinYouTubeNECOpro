package com.pk4u.activity_intent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.pk4u.activity_intent.constance.Constance
import com.pk4u.activity_intent.databinding.ActivitySignUpInBinding

class SignUP : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpInBinding
    private var signState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if (signState==Constance.SIGN_IN_STATE){
            binding.etName.visibility = View.GONE
            binding.etSurname.visibility = View.GONE
            binding.etPatronymic.visibility = View.GONE
            binding.bAvatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view: View){
        if (signState==Constance.SIGN_UP_STATE){
            val intent = Intent ()
            intent.putExtra(Constance.LOGIN, binding.etLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, binding.etPassword.text.toString())
            intent.putExtra(Constance.NAME, binding.etName.text.toString())
            intent.putExtra(Constance.SURNAME, binding.etSurname.text.toString())
            intent.putExtra(Constance.PATRONYMIC, binding.etPatronymic.text.toString())
            if (binding.ivAvatar.isVisible) intent.putExtra(Constance.AVATAR_ID, R.drawable.ic_avatar__1_)
            setResult(RESULT_OK,intent)
            finish()
        } else if (signState==Constance.SIGN_IN_STATE){
            intent.putExtra(Constance.LOGIN, binding.etLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, binding.etPassword.text.toString())
            setResult(RESULT_OK,intent)
            finish()
        }
    }

    fun onClickAvatar(view: View){
        binding.ivAvatar.visibility = View.VISIBLE

    }
}