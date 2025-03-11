package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MinibarRequestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minibar_request)

        // Find the buttons by their IDs
        val buttonRefillSnacks = findViewById<Button>(R.id.buttonRefillSnacks)
        val buttonRefillDrinks = findViewById<Button>(R.id.buttonRefillDrinks)
        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)

        // Set click listeners for each button
        buttonRefillSnacks.setOnClickListener {
            // Show a toast message
            Toast.makeText(this, "Request sent", Toast.LENGTH_SHORT).show()
            // Return to HomeActivity
            returnToSendRequestActivity()
        }

        buttonRefillDrinks.setOnClickListener {
            // Show a toast message
            Toast.makeText(this, "Request sent", Toast.LENGTH_SHORT).show()
            // Return to HomeActivity
            returnToSendRequestActivity()
        }

        buttonHome.setOnClickListener {
            // Create an Intent to start HomeActivity
            val intent = Intent(this, SendRequestActivity::class.java)
            // Start HomeActivity
            startActivity(intent)

        }

    }

    // Function to return to HomeActivity
    private fun returnToSendRequestActivity() {
        val intent = Intent(this, SendRequestActivity::class.java)
        startActivity(intent)
        finish()
    }
}
