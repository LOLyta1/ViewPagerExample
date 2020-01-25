package com.nata.tsivileva.kotlintraning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager.adapter=MyFragmentAdapter(supportFragmentManager)
        tab_layout.setupWithViewPager(view_pager)
    }
}
