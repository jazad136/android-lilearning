package com.example.myfirstapp.util

import android.util.Log
const val TAG = "my_tag"
class MyFirstClass {
    // Shift F6 renames the variable
    fun saySomething() {
        Log.d(TAG, "saySomething: Hello!")
    }
}