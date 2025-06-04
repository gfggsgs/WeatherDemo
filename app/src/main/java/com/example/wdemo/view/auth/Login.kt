package com.example.wdemo.view.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wdemo.MainActivity
import com.example.wdemo.R
import com.example.wdemo.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputLayout

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            var email = binding.etEmail.editText!!.text.toString()
            var password = binding.etPassword.editText!!.text.toString()


            if (TextUtils.isEmpty(email)) {
                binding.etEmail.error = "Email is required"
                binding.etEmail.requestFocus()
            } else if (TextUtils.isEmpty(password)) {
                binding.etPassword.requestFocus()
                binding.etPassword.error = "Password is required"
            } else {
                val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            }

        }

        binding.txtForget.setOnClickListener{
            val intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)

        }
        binding.txtRegister.setOnClickListener{
            // navigate to sign up
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }





    }
}


//find id
// 1. intialize
// 2. find id

// use binding (we will use)
// just one time intialization unlike findViewById
// to use binding, have to enable view binding in build.gradle
//buildFeatures {
//    viewBinding = true
//}