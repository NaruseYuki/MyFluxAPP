package com.yushin.myfluxapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yushin.myfluxapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().replace(
            R.id.container_main_fragment,
            TodoFragment()
        ).commit()
    }
}
