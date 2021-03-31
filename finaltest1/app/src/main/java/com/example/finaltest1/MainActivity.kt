package com.example.finaltest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum.setOnClickListener {
            var bmi = 0.00
            var h1 = 0.00
            var h2 = 0.00
            h1 = height.text.toString().toDouble()/100
            h2 = h1*h1
           bmi =weight.text.toString().toDouble()/h2
            bmi1.setText(bmi.toString())

        }
        sum2.setOnClickListener {
            var w = 0.00
            var h = 0.00
            var a = 0.00
            var bmr = 0.00
            w = 13.7*weight.text.toString().toDouble()+66
            h = 5*height.text.toString().toDouble()
            a = 6.8*age.text.toString().toDouble()
            bmr = w+h-a
            bmr1.setText(bmr.toString())
        }
        sum3.setOnClickListener {
            var w1 = 0.00
            var h1 = 0.00
            var a1 = 0.00
            var bmr2 = 0.00
            w1 = 9.6*weight.text.toString().toDouble()+665
            h1 = 1.8*height.text.toString().toDouble()
            a1 = 4.7*age.text.toString().toDouble()
            bmr2 = w1+h1-a1
            bmr1.setText(bmr2.toString())
        }
        sum3.setOnClickListener {
            var w1 = 0.00
            var h1 = 0.00
            var a1 = 0.00
            var bmr2 = 0.00
            w1 = 9.6*weight.text.toString().toDouble()+665
            h1 = 1.8*height.text.toString().toDouble()
            a1 = 4.7*age.text.toString().toDouble()
            bmr2 = w1+h1-a1
            bmr1.setText(bmr2.toString())
        }
        t1.setOnClickListener {
            var tdee = 0.00
            tdee = bmr1.text.toString().toDouble()*1.2
            tdee1.setText(tdee.toString())
        }
        t2.setOnClickListener {
            var tdee = 0.00
            tdee = bmr1.text.toString().toDouble()*1.375
            tdee1.setText(tdee.toString())
        }
        t3.setOnClickListener {
            var tdee = 0.00
            tdee = bmr1.text.toString().toDouble()*1.55
            tdee1.setText(tdee.toString())
        }
        t4.setOnClickListener {
            var tdee = 0.00
            tdee = bmr1.text.toString().toDouble()*1.725
            tdee1.setText(tdee.toString())
        }
        t5.setOnClickListener {
            var tdee = 0.00
            tdee = bmr1.text.toString().toDouble()*1.9
            tdee1.setText(tdee.toString())
        }
    }
}