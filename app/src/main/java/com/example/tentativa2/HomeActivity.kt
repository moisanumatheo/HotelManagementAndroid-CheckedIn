package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Find the logout button by its ID
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)

        // Set click listener for logout button
        buttonLogout.setOnClickListener {
            // Create an Intent to start LoginActivity
            val intent = Intent(this, LoginActivity::class.java)

            // Clear all previous activities in the back stack
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)

            // Start LoginActivity
            startActivity(intent)

            // Finish the current activity
            finish()
        }

        // Find the send request button by its ID
        val buttonSendRequest = findViewById<Button>(R.id.buttonSendRequest)

        // Set click listener for send request button
        buttonSendRequest.setOnClickListener {
            // Create an Intent to start SendRequestActivity
            val intent = Intent(this, SendRequestActivity::class.java)

            // Start SendRequestActivity
            startActivity(intent)
        }
    }
}

