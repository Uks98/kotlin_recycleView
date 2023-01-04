package com.example.recycleviewexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val profileList = arrayListOf(
            Profiles(R.drawable.old_man,"성영욱",27,"앱개발자"),
            Profiles(R.drawable.old_man,"김홍신",27,"간호사"),
            Profiles(R.drawable.old_man,"오영수",27,"사회복지사"),
            Profiles(R.drawable.old_man,"진오연",27,"공무원"),
        )
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvProfile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvProfile.setHasFixedSize(true)
        binding.rvProfile.adapter = ProfileAdapter(profileList)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}