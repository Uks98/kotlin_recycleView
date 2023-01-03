package com.example.recycleviewexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var tv_profile = findViewById<RecyclerView>(R.id.rv_profile)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.old_man,"성영욱",27,"앱개발자"),
            Profiles(R.drawable.old_man,"김홍신",27,"간호사"),
            Profiles(R.drawable.old_man,"오영수",27,"사회복지사"),
            Profiles(R.drawable.old_man,"진오연",27,"공무원"),
        )
        tv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        tv_profile.setHasFixedSize(true)
        tv_profile.adapter = ProfileAdapter(profileList)
    }
}