package com.example.toastname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var fName:EditText
    lateinit var lName:EditText
    lateinit var btn:Button
    lateinit var cl:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fName=findViewById(R.id.ed1)
        lName=findViewById(R.id.ed2)
        btn=findViewById(R.id.btn)
        cl=findViewById(R.id.CL)

        btn.setOnClickListener(){
            var name1=fName.text.toString()
            var name2=lName.text.toString()
            Toast.makeText(applicationContext, "you are $name1 $name2 !" ,Toast.LENGTH_LONG).show()
        }
    }
}