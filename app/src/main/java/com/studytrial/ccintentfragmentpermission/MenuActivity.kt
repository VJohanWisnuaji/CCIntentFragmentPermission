package com.studytrial.ccintentfragmentpermission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val dataParcel = intent.getParcelableExtra<DataParcel>("AN_OBJECT") as DataParcel
        val nama = dataParcel.nama
        tv_vs_komputer.setText("$nama VS Komputer")

        iv_menu_komputer.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}