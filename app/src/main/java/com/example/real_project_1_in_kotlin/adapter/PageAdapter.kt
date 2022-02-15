package com.example.real_project_1_in_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.real_project_1_in_kotlin.R
import com.example.real_project_1_in_kotlin.model.Recycler
import com.example.real_project_1_in_kotlin.model.Recycler2

class PageAdapter(var context: Context, var list: ArrayList<Recycler2>): PagerAdapter(){

    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycler_view_two,container,false)

        val model = list[position]
        val image = model.image
        val profile2 = view.findViewById<ImageView>(R.id.profile2)
        profile2.setImageResource(image)

        container.addView(view,position)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}
