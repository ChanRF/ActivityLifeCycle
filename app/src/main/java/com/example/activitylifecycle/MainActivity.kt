package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitylifecycle.Models.QuestionModel

class MainActivity : AppCompatActivity() {

    private lateinit var myModel : QuestionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      //  myModel = ViewModelProvider(this).get(QuestionModel :: class.java) //only single view
        myModel = QuestionModel.getInstance()

        val btn : Button = findViewById(R.id.btnNext)




        btn.setOnClickListener(){
            var intent : Intent = Intent(this, SecondActivity::class.java )
            myModel.name = findViewById<TextView>(R.id.tfName).text.toString()
            startActivity(intent)
        }
    }
}