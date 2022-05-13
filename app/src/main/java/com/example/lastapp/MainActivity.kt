package com.example.lastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a523kotlin.Chat_Adapter_RecyclerView
import com.example.a523kotlin.ContactLists
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
     id_R.layoutManager = GridLayoutManager(this,1)
        val lists = ArrayList<ContactLists>()
        lists.add(ContactLists(R.drawable.rasm, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm1, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm2, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm3, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm4, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm6, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm6, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm7, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm8, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm9, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm10, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm4, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))
        lists.add(ContactLists(R.drawable.rasm5, "Alisher Daminov", 3))

        val adapters =  Chat_Adapter_RecyclerView(this,lists)
        id_R.adapter = adapters
    }
}