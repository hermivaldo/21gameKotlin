package com.example.hermivaldobraga.a21gamekotlin

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.hermivaldobraga.a21gamekotlin.fragments.GameFragment
import com.example.hermivaldobraga.a21gamekotlin.fragments.SobreFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_jogar -> {
                changeFragment(GameFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sobre -> {
                changeFragment(SobreFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sair -> {
                finish()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun changeFragment (fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFrame, fragment)
                .addToBackStack(null)
                .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
