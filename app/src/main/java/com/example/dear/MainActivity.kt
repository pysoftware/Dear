package com.example.dear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        olenn.setOnClickListener {
            val animationOlen = AnimationUtils.loadAnimation(this, R.anim.olen)
            val animationDialog = AnimationUtils.loadAnimation(this, R.anim.dialog)
            olenn.startAnimation(animationOlen)
            dialog.startAnimation(animationDialog)

        }
    }
}
