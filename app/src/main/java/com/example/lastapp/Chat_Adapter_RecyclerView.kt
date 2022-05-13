package com.example.a523kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lastapp.R
import com.google.android.material.imageview.ShapeableImageView

class Chat_Adapter_RecyclerView(var context: Context?, var contactLists: ArrayList<ContactLists>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {
        val image: ShapeableImageView = item.findViewById(R.id.iv_profile)
        val fullname: TextView = item.findViewById(R.id.fullname)
        val online: TextView = item.findViewById(R.id.tv_count_online)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_items, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val lists = contactLists[position]
        if (holder is MyViews) {
            holder.image.setImageResource(lists.profile)
            holder.fullname.text = lists.fullname
            holder.online.text = lists.online.toString()
        }
    }

    override fun getItemCount(): Int {
        return contactLists.size
    }

}