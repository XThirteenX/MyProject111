package com.example.testtgu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    fun main() {
        val myList = ('a'..'z').toMutableList()
        myList.removeAll{ it.code % 2 != 0 }
        for(i in myList){
            println("$i ")
        }
    }

}