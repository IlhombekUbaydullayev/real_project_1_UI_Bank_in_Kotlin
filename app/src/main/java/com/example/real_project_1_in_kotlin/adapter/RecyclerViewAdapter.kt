package com.example.real_project_1_in_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.real_project_1_in_kotlin.R
import com.example.real_project_1_in_kotlin.model.Recycler

class RecyclerViewAdapter(var context: Context,var list: ArrayList<Recycler>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = list[position]
        if (holder is MessageViewHolder) {
            var image = holder.image
            var text = holder.text

            image.setImageResource(item.image)
            text.text = item.title
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var image : ImageView
    var text : TextView

    init {
        image = view.findViewById(R.id.profile)
        text = view.findViewById(R.id.text)
    }
}
