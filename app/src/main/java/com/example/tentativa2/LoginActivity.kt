package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    // Define your views
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize views
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        // Set click listener for login button
        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Perform authentication
            when {
                isValidClient(username, password) -> {
                    // Proceed to HomeActivity
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    // Finish the LoginActivity
                    finish()
                }
                isValidManager(username, password) -> {
                    // Proceed to ManagerHomeActivity
                    val intent = Intent(this, ManagerActivity::class.java)
                    startActivity(intent)
                    // Finish the LoginActivity
                    finish()
                }
                isValidEmployee(username, password) -> {
                    // Proceed to EmployeeHomeActivity
                    val intent = Intent(this, EmployeeActivity::class.java)
                    startActivity(intent)
                    // Finish the LoginActivity
                    finish()
                }
                else -> {
                    // Authentication failed
                    Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    // Check if the user is a client
    private fun isValidClient(username: String, password: String): Boolean {
        return username == "client" && password == "password"
    }

    // Check if the user is a manager
    private fun isValidManager(username: String, password: String): Boolean {
        return username == "manager" && password == "password"
    }

    // Check if the user is an employee
    private fun isValidEmployee(username: String, password: String): Boolean {
        return username == "employee" && password == "password"
    }
}
