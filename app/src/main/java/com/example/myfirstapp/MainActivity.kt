package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.util.MyFirstClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saySomething()
        // Command Backspace to delete
        // Command D to duplicate

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