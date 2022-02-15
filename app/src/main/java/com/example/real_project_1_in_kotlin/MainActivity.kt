package com.example.real_project_1_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.*
import androidx.viewpager.widget.ViewPager
import com.example.real_project_1_in_kotlin.adapter.RecyclerViewAdapter
import com.example.real_project_1_in_kotlin.adapter.PageAdapter
import com.example.real_project_1_in_kotlin.adapter.RecyclerViewAdapterBottom
import com.example.real_project_1_in_kotlin.model.Recycler
import com.example.real_project_1_in_kotlin.model.Recycler2


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerViewSecond: RecyclerView
    lateinit var viewAdapter: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        viewAdapter = findViewById(R.id.viewPager)
        recyclerViewSecond = findViewById(R.id.recycler_bottom)
        recyclerViewSecond.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        refreshAdapter(getAllChats(),getRecycler2(),getBottom())

    }

    private fun getBottom(): ArrayList<Recycler> {
        val chats3 : ArrayList<Recycler> = ArrayList()
        chats3.add(Recycler(R.drawable.invoice,"Ilhombek Ubaydullayev"))
        chats3.add(Recycler(R.drawable.ic_baseline_location_on_24,"Ilhombek Ubaydullayev"))
        chats3.add(Recycler(R.drawable.delete,"Ilhombek Ubaydullayev"))

        return chats3
    }

    private fun getRecycler2(): ArrayList<Recycler2> {
        val item : ArrayList<Recycler2> = ArrayList()
        item.add(Recycler2(R.drawable.imag))
        item.add(Recycler2(R.drawable.product8))
        item.add(Recycler2(R.drawable.img27))
        item.add(Recycler2(R.drawable.img29))
        item.add(Recycler2(R.drawable.img24))
        return item
    }

    private fun getAllChats(): ArrayList<Recycler> {
        val chats : ArrayList<Recycler> = ArrayList()
        chats.add(Recycler(R.drawable.mobil,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.qiwi,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.free,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.mobil,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.qiwi,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.free,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.product1,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.img26,"Ilhombek Ubaydullayev"))
        chats.add(Recycler(R.drawable.mobil,"Ilhombek Ubaydullayev"))
        return  chats;
    }

    private fun refreshAdapter(
        chats: ArrayList<Recycler>,
        chats2: ArrayList<Recycler2>,
        chats3: ArrayList<Recycler>
    ) {
        val adapter = RecyclerViewAdapter(this,chats)
        val adapter2 = PageAdapter(this,chats2)
        val adapter3 = RecyclerViewAdapterBottom(this,chats3)
        recyclerView.adapter = adapter
        viewAdapter.adapter = adapter2
        viewAdapter.setPadding(55,0,30,0)
        recyclerViewSecond.adapter = adapter3
    }
    }

