package com.example.finalproject_netfelx.MainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject_netfelx.Fragment.ContentFragment
import com.example.finalproject_netfelx.Fragment.HomeFragment
import com.example.finalproject_netfelx.Fragment.MoreFragment
import com.example.finalproject_netfelx.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val HomeFragment = HomeFragment()
            supportFragmentManager.beginTransaction().replace(R.id.frame_main, HomeFragment).commit()
        }

        bnv_main.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.bnv_home -> {
                    val firstFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_main, firstFragment).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.bnv_save -> {
                    val secondFragment = ContentFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_main, secondFragment).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.bnv_mypage -> {
                    val thirdFragment = MoreFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_main, thirdFragment).commit()
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false
        }
    }
}