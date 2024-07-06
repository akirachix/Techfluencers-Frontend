package com.example.real_fashion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.real_fashion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.tvlogin.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
        binding.btsubmit.setOnClickListener{
            validateRegistration()

        }

    }
    fun validateRegistration(){
        clearErrors()
        var formErrors = false
        val fullname = binding.tilfirstname.text.toString()
        if (fullname.isBlank()){
            formErrors = true
            binding.tvfullname.error = "fullname is required"

        }
        val username = binding.username.text.toString()
        if (username.isBlank()){
            formErrors = true

            binding.etusername.error = "user Name  is required"

        }
        val email = binding.etemail.text.toString()
        if (email.isBlank()){
            formErrors = true
            binding.tilemail.error = "email is required"

        }
        val password = binding.etpassword.text.toString()
        if (password.isBlank()){
            formErrors = true
            binding.tilpassword.error = "password is required"

        }
        val confirmPassword = binding.etconfirmpass.text.toString()
        if (confirmPassword.isBlank()){
            formErrors = true
            binding.tilconfirmpassword.error = "password is required"

        }



    }
    fun clearErrors(){
        binding.tilfirstname.error = null
        binding.tilemail.error = null
        binding.username.error = null
        binding.tilpassword.error = null
        binding.tilconfirmpassword.error=null

    }
}