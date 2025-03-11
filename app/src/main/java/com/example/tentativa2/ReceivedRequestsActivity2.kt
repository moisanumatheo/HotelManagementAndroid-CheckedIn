package com.example.tentativa2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ReceivedRequestsActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.received_requests_activity)

        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)

        buttonHome.setOnClickListener {
            // Navigate back to ManagerActivity
            val intent = Intent(this, ManagerActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity to prevent going back to it on home button press
        }
    }
}
