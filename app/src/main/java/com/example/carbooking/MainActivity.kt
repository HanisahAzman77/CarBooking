package com.example.carbooking
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.carbooking.MainActivity4

class MainActivity : AppCompatActivity() {
    private lateinit var btnA: Button
    private lateinit var btnR : Button
    private lateinit var btnF :Button
    private lateinit var btnL : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize all button
        btnA = findViewById<Button>(R.id.btnAdd)
        btnR = findViewById<Button>(R.id.btnRead)
        btnF = findViewById<Button>(R.id.btnFaq)
        btnL = findViewById<Button>(R.id.btnLoan)
        //function press button for button add record
        btnA.setOnClickListener {
            //declare variable i to connect to next pages/activity = MainActivity2
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
        btnR.setOnClickListener {
            //declare variable i to connect to next pages/ activity = MainActivity 3
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)

        }
        btnF.setOnClickListener{
            //declare variable i to connect to next pages/activity = MainActivity2
            val i = Intent(this, MainActivity5::class.java)
            startActivity(i)  }

        btnL.setOnClickListener {
            //declare variable i to connect to next pages/activity = MainActivity2
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }


    }
}