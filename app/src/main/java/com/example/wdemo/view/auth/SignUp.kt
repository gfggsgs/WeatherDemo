package com.example.wdemo.view.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wdemo.MainActivity
import com.example.wdemo.R
import com.example.wdemo.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            val username = binding.etUsername.editText!!.text.toString()
            val email = binding.etEmail.editText!!.text.toString()
            val password = binding.etPassword.editText!!.text.toString()
            val confirmPassword = binding.etConfirmPassword.editText!!.text.toString()

            when {
                TextUtils.isEmpty(username) -> {
                    binding.etUsername.error = "Username is required"
                    binding.etUsername.requestFocus()
                }
                TextUtils.isEmpty(email) -> {
                    binding.etEmail.error = "Email is required"
                    binding.etEmail.requestFocus()
                }
                TextUtils.isEmpty(password) -> {
                    binding.etPassword.error = "Password is required"
                    binding.etPassword.requestFocus()
                }
                TextUtils.isEmpty(confirmPassword) -> {
                    binding.etConfirmPassword.error = "Confirm password is required"
                    binding.etConfirmPassword.requestFocus()
                }
                password != confirmPassword -> {
                    binding.etConfirmPassword.error = "Passwords do not match"
                    binding.etConfirmPassword.requestFocus()
                }
                else -> {
                    // Proceed with sign up
                    Log.d("SignUp", "Sign Up sussessful for Username: $username, Email: $email")
                }
            }
        }
        binding.txtLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }

    }
}