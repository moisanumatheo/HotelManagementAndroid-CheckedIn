package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)

        val buttonReceivedRequests = findViewById<Button>(R.id.buttonReceivedRequests)
        val buttonRoomOccupancy = findViewById<Button>(R.id.buttonRoomOccupancy)
        val buttonCheckEmployees = findViewById<Button>(R.id.buttonCheckEmployees)
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)

        buttonReceivedRequests.setOnClickListener {
            val intent = Intent(this, ReceivedRequestsActivity2::class.java)
            startActivity(intent)
        }

        buttonRoomOccupancy.setOnClickListener {
            val intent = Intent(this, RoomOccupancyActivity2::class.java)
            startActivity(intent)
        }

        buttonCheckEmployees.setOnClickListener {
            val intent = Intent(this, EmployeesListActivity::class.java)
            startActivity(intent)
        }

        buttonLogout.setOnClickListener {
            // Navigate back to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity to prevent going back to it on logout
        }
    }
}
