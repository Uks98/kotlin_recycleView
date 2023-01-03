package com.example.recycleviewexam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView


class ProfileAdapter (val profileList: ArrayList<Profiles>): RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): ProfileAdapter.CustomViewHolder {
        //화면 붙이는 작업
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false) //어댑터에 붙이기
        return CustomViewHolder(view) // 커스텀 뷰 홀더로 반환 생성자-> view
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
    //데이터 매치
        holder.gender.setImageResource(profileList.get(position).gender) //현재 클릭한 위치 연동
        holder.name.text = profileList.get(position).name
        holder.age.text = profileList.get(position).age.toString()
        holder.job.text = profileList.get(position).job
    }

    override fun getItemCount(): Int {
    //리스트에 대한 총 개수
        return profileList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val gender = itemView.findViewById<ImageView>(R.id.id_profile) //성별
        val age = itemView.findViewById<TextView>(R.id.tv_age) //나이
        val name = itemView.findViewById<TextView>(R.id.tv_name)//이름
        val job = itemView.findViewById<TextView>(R.id.tv_job)//직업
    }
}