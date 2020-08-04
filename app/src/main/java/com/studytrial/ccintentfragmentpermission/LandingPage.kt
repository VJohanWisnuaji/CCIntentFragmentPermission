package com.studytrial.ccintentfragmentpermission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_landing_page.*
import org.intellij.lang.annotations.JdkConstants

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        vp_landing.adapter = PageAdapter(supportFragmentManager)
//        tabDots.setupWithViewPager(vp_landing)
    }
}