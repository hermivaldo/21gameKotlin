package com.example.hermivaldobraga.a21gamekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DIPLAY_LENGTH = 3500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        this.carregar()
    }

    fun carregar(){
        val custonAnim = AnimationUtils.loadAnimation(this, R.anim.animacoes_splash)
        custonAnim.reset()

        ivLogo.clearAnimation()
        ivLogo.startAnimation(custonAnim)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity,
                    MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)

            this@SplashActivity.finish()

        }, SPLASH_DIPLAY_LENGTH)
    }
}
