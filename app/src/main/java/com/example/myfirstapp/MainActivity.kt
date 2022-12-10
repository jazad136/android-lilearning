package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.utilities.MyClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myClass = MyClass()

        myClass.saySomething()
        // Command Backspace to delete
        // Command D to duplicate

    }

    fun myFunc1() {

    }
    fun myFunc2() {

    }
}