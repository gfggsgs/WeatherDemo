package com.example.wdemo.view.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wdemo.MainActivity
import com.example.wdemo.R
import com.example.wdemo.databinding.ActivityForgetPasswordBinding

class ForgetPassword : AppCompatActivity() {
    private lateinit var binding : ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)

        binding.btnNext.setOnClickListener {
            var email = binding.etEmail.editText!!.text.toString()
            if(TextUtils.isEmpty(email)){
                binding.etEmail.error = "Email is required"
                binding.etEmail.requestFocus()

          } else {
              // send link to email
              val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
          }
        }
        binding.btnForgetOk.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }

        setContentView(binding.root)



    }
}