package com.chaacho.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import java.util.Random as Random

class MainActivity : AppCompatActivity() {
 lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_buton)
        diceImage=findViewById(R.id.ivDado)
        rollButton.setOnClickListener {
            rollEm()
        }

    }

    private fun rollEm() {
        // Random strike! Number to show
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        // Send the toast to UI
        Toast.makeText(this, "Thats it !", Toast.LENGTH_SHORT).show()

    }


}