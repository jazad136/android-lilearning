package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myfirstapp.util.MyFirstClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saySomething()
        // Double Shift to Search Everywhere
        // Command Backspace to delete
        // Command D to duplicate
        // Fn Shift F6 to rename a variable
        // Highlight Text - Go to Menu Item [Refactor] [Refactor This] - [Function] to turn
        // lines into a function

        // clipboard data
        // saySomething()
        // clipboard data
        // setContentView(R.layout.activity_main)

    }

    private fun saySomething() {
        val myFirstClass = MyFirstClass()


        myFirstClass.saySomething()
    }

    fun myFunc1() {

    }
    fun myFunc2() {

    }
}