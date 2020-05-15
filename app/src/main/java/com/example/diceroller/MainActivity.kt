package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //lateinit var dice_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       // val rollbutton: Button = findViewById(R.id.roll_button)


        binding.rollButton.setOnClickListener{
            rolldice()
        }



//        rollbutton.setOnClickListener {
//               rolldice()
//        }


        //dice_image = findViewById(R.id.dice_image)


    }

    private fun rolldice() {
        val random_num = Random.nextInt(6) +1


        val drawable_image = when(random_num){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        binding.diceImage.setImageResource(drawable_image)

    }
}
