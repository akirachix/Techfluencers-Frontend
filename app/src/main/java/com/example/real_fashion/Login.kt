package com.example.real_fashion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.real_fashion.databinding.ActivityLoginBinding
import com.example.real_fashion.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)


        setContentView(binding.root)
        binding.etsignup.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.butsub.setOnClickListener{
            validateLogin()

        }

    }
    fun validateLogin(){
        clearError()
        var formErrors = false
        val username2 = binding.etusernametwo.text.toString()
        if(username2.isBlank()){
            formErrors = true
            binding.etusername.error = "username is required"
        }
        val passowrd= binding.etpasswordtwo.text.toString()
        if(passowrd.isBlank()){
            formErrors = true
            binding.tilpass.error = "password  is required"
        }

    }
    fun clearError(){
        binding.etusername.error = null
        binding.tilpass.error = null
    }

}