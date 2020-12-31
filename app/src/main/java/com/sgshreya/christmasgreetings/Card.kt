package com.sgshreya.christmasgreetings

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_card.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class Card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val name=intent.getStringExtra("name")
        val message=intent.getStringExtra("message")
        name_text.text="Happy New Year \n $name"
        message_text.text="$message"

        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.animation)
        name_text.startAnimation(animationFadeIn)

        viewKonfetti.build()
            .addColors(Color.CYAN,Color.WHITE,Color.YELLOW,Color.GREEN,Color.BLUE)
            .setDirection(0.0,359.0)
            .setSpeed(1f,5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2000L)
            .addShapes(Shape.Circle,Shape.Square)
            .addSizes(Size(12))
            .setPosition(-50f,viewKonfetti.width+50f,-50f,-50f)
            .streamFor(400,10000L)
    }
}