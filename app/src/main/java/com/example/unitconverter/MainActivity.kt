package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt
import com.example.unitconverter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring variables
        var kilo: EditText = findViewById(R.id.kilo)
        var btn: Button = findViewById(R.id.btn)
        var pound: TextView = findViewById(R.id.pound)


        //showing message
        btn.setOnClickListener() {

            //input from text into doubles
            val result = kilo.text.toString().toDouble()

            //setting pound as result
            pound.setText(""+converted(result)+"\nPounds")

        }

    }
    //conversion from kilo to text
    fun converted(result: Double): Double {
        var pounds = ((result * 2.20462)*10000).roundToInt()/10000.toDouble()
        return pounds

    }
}
