// ReceivedRequestsActivity.kt
package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ReceivedRequestsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.received_requests_activity)

        // Find the home button by its ID
        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)

        // Set click listener for home button
        buttonHome.setOnClickListener {
            // Navigate back to EmployeeActivity
            val intent = Intent(this, EmployeeActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity
        }
    }
}
