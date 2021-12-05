package com.example.testtgu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private lateinit var buttonAs: Button
    private val URL = "https://yandex.ru/search/?text=Как+гладить+ежика&clid=2270455&banerid=0500000134%3A5d1efb8391a74e0025e1cb17&win=392&lr=55"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonAs = findViewById(R.id.button_as)

        onClickAs()

    }

    private fun onClickAs() {
        buttonAs.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(URL)
            startActivity(intent)
        }

    }

}