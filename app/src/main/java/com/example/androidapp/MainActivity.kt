package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animalName", pet1.name)
            intent.putExtra("animalDescription", pet1.description)
            intent.putExtra("breed", pet1.breed)
            intent.putExtra("animalImageResId", pet1.imageResId)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animalName", pet2.name)
            intent.putExtra("animalDescription", pet2.description)
            intent.putExtra("breed", pet2.breed)
            intent.putExtra("animalImageResId", pet2.imageResId)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animalName", pet3.name)
            intent.putExtra("animalDescription", pet3.description)
            intent.putExtra("breed", pet3.breed)
            intent.putExtra("animalImageResId", pet3.imageResId)
            startActivity(intent)
        }
    }
}

