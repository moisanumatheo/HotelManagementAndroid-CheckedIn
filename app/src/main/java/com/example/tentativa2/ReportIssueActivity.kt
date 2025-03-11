package com.example.tentativa2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ReportIssueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_issue)

        // Find the home button by its ID
        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)

        // Set click listener for the home button
        buttonHome.setOnClickListener {
            // Create an Intent to start HomeActivity
            val intent = Intent(this, SendRequestActivity::class.java)
            // Start HomeActivity
            startActivity(intent)

        }

        // Find the send button by its ID
        val buttonSend = findViewById<Button>(R.id.buttonSend)

        // Set click listener for the send button
        buttonSend.setOnClickListener {
            // Perform sending issue
            // For now, just show a toast indicating the issue is sent
            Toast.makeText(this, "Issue sent!", Toast.LENGTH_SHORT).show()
            // Return to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity
        }
    }
}
