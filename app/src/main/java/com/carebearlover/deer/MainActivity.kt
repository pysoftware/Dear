package com.carebearlover.deer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds


class MainActivity : AppCompatActivity() {

    private var checkTitle = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this)
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

        val animationOlen = AnimationUtils.loadAnimation(this, R.anim.olen)
        val animationDialog = AnimationUtils.loadAnimation(this, R.anim.dialog)
        val animationTitle = AnimationUtils.loadAnimation(this, R.anim.drop_title)
//        val animationTitleScale = AnimationUtils.loadAnimation(this, R.anim.title_scale)

        olenn.setOnClickListener {
            if(checkTitle) {
                tv_title.startAnimation(animationTitle)
                tv_title.visibility = GONE
                checkTitle = false
            }

            when((0..9).random()) {
                0 -> dialog.setImageResource(R.drawable.q)
                1 -> dialog.setImageResource(R.drawable.w)
                2 -> dialog.setImageResource(R.drawable.e)
                3 -> dialog.setImageResource(R.drawable.r)
                4 -> dialog.setImageResource(R.drawable.t)
                5 -> dialog.setImageResource(R.drawable.y)
                6 -> dialog.setImageResource(R.drawable.u)
                7 -> dialog.setImageResource(R.drawable.i)
                8 -> dialog.setImageResource(R.drawable.o)
                9 -> dialog.setImageResource(R.drawable.p)
            }

            olenn.startAnimation(animationOlen)

            dialog.visibility = VISIBLE
            dialog.startAnimation(animationDialog)

        }
    }
}
