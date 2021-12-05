package com.example.testtgu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Пушкин А. С. - Уродился я, бедный недоносок…")

        button = findViewById(R.id.button)

        main()
        onClick()
    }

    private fun onClick() {
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }


    private fun main() {
        val myList = ('a'..'z').toMutableList()
        myList.removeAll{ it.code % 2 != 0 }
        for(i in myList){
            println("$i ")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Уродился я, бедный недоносок,")

    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "С глупых лет брожу я сиротою;")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Недорослем меня бедного женили;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Новая семья не полюбила;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Сударыня жена не приласкала.")
    }
}