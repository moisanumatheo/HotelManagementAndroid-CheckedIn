package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EmployeeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        // Find buttons by their IDs
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)
        val buttonReceivedRequests = findViewById<Button>(R.id.buttonReceivedRequests)
        val buttonRoomOccupancy = findViewById<Button>(R.id.buttonRoomOccupancy)

        // Set click listeners for buttons
        buttonLogout.setOnClickListener {
            // Navigate back to LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Finish current activity
        }

        buttonReceivedRequests.setOnClickListener {
            // Navigate to ReceivedRequestsActivity
            startActivity(Intent(this, ReceivedRequestsActivity::class.java))
        }

        buttonRoomOccupancy.setOnClickListener {
            // Navigate to RoomOccupancyActivity
            startActivity(Intent(this, RoomOccupancyActivity::class.java))
        }
    }
}
