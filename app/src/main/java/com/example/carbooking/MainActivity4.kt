package com.example.carbooking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity4 : AppCompatActivity() {
    //declare the component that will use
    //lateinit - never initialize the button btn1 - btnMonthly
    lateinit var b1 : Button
    //lateinit - never initialize the button btn2 - btnReset
    lateinit var b2 : Button
    //lateinit - never initialize the button btn3 - btnYearly
    lateinit var b3 : Button
    //lateinit - never initialize the textview - tvStatus
    lateinit var t1 : TextView
    //lateinit - never initialize the editText "EditTextLoan"
    lateinit var loan : EditText
    //lateinit - never initialize the editText "EditTextDuration"
    lateinit var duration : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        b1 = findViewById<Button>(R.id.btnMonthly)
        b2 = findViewById<Button>(R.id.btnYearly)
        b3 = findViewById<Button>(R.id.btnReset)
        t1 = findViewById<TextView>(R.id.tvStatus)
        loan = findViewById<EditText>(R.id.editTextLoan)
        duration = findViewById<EditText>(R.id.editTextDuration)

        //initialize function decimal
        val df = DecimalFormat ("#,###,###.##")
        //set fucntion for button monthly
        b1.setOnClickListener{
            var loanVal:Double = loan.text.toString().toDouble()
            var durationVal:Double = duration.text.toString().toDouble()
            //durationVal *12
            var mPay = ((loanVal *0.03 + loanVal)/(durationVal*12))
            t1.text = "Monthly payment RM" + df.format(mPay).toString()
        }
        //set function for button Yearly
        b2.setOnClickListener{
            var loanVal:Double = loan.text.toString().toDouble()
            var durationVal:Double = duration.text.toString().toDouble()
            //durational *12
            var yPay = ((loanVal *0.03 + loanVal)/durationVal)
            t1.text = "Yearly payment RM" + df.format(yPay).toString()
        }

        //set function for button Reset
        b3.setOnClickListener{
            //to reset all amount
            loan.setText(" ")
            duration.setText("")
            t1.text = " "
        }
    }
}