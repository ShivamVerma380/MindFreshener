package com.shivam.mindfreshener

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val  mList:List<ItemsViewModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val  itemsViewModel = mList[position]
        holder.imageView.setImageResource(itemsViewModel.image)
        holder.textView.setText(itemsViewModel.text)
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val imageView:ImageView = itemView.findViewById(R.id.imageview);
        val textView:TextView = itemView.findViewById(R.id.textView);
    }


}