package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(R.string.nmedia)
        println(getString(R.string.nmedia))
        println(resources.displayMetrics.heightPixels)
        println(resources.displayMetrics.widthPixels)

    }

    fun onMyClick(view: View) {
        Toast.makeText(applicationContext, "SUPER", Toast.LENGTH_LONG).show();

    }
}