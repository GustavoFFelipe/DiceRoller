package app.alpha.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // create a val that find the button by your ID that we defined.
        val rollButton: Button = findViewById(R.id.roll_button)
        // this method see what happen with button. The Toast method will show a message in the screen for a period SHORT.
        rollButton.setOnClickListener{
            //Toast.makeText(this, "Dice is rolling", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() { // function with de rules of the dice rolling random

        val randomInt = java.util.Random().nextInt(6) +1
        val drawableResource = when (randomInt) {  // we defined images for which random number from dice
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)

    }
}