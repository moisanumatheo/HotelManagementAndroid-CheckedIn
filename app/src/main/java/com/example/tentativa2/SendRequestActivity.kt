package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SendRequestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_request)

        // Find all buttons by their IDs
        val buttonExpand1Day = findViewById<Button>(R.id.buttonExpand1Day)
        val buttonRoomService = findViewById<Button>(R.id.buttonRoomService)
        val buttonCancelReservation = findViewById<Button>(R.id.buttonCancelReservation)
        val buttonMinibar = findViewById<Button>(R.id.buttonMinibar)
        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)
        val buttonReportIssue = findViewById<Button>(R.id.buttonReportIssue)

        buttonHome.setOnClickListener {
            // Return to HomeActivity
            returnToHomeActivity()
        }

        // Set click listeners for each button
        buttonExpand1Day.setOnClickListener {
            // Show a toast message
            Toast.makeText(this, "Request sent", Toast.LENGTH_SHORT).show()
            // Return to HomeActivity
            returnToHomeActivity()
        }

        buttonRoomService.setOnClickListener {
            // Show a toast message
            Toast.makeText(this, "Request sent", Toast.LENGTH_SHORT).show()
            // Return to HomeActivity
            returnToHomeActivity()
        }

        buttonCancelReservation.setOnClickListener {
            // Show a toast message
            Toast.makeText(this, "Request sent", Toast.LENGTH_SHORT).show()
            // Return to HomeActivity
            returnToHomeActivity()
        }

        buttonMinibar.setOnClickListener {
            // Create an Intent to start MinibarRequestActivity
            val intent = Intent(this, MinibarRequestActivity::class.java)
            startActivity(intent)
        }

        buttonReportIssue.setOnClickListener {
            // Create an Intent to start MinibarRequestActivity
            val intent = Intent(this, ReportIssueActivity::class.java)
            startActivity(intent)
        }
    }

    // Function to return to HomeActivity
    private fun returnToHomeActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}