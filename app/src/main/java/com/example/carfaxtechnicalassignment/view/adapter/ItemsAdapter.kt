package com.example.carfaxtechnicalassignment.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.carfaxtechnicalassignment.R
import com.example.carfaxtechnicalassignment.databinding.CarRowBinding
import com.example.carfaxtechnicalassignment.model.ListingsItem
import com.example.carfaxtechnicalassignment.view.fragments.ClickListener
import com.example.carfaxtechnicalassignment.view.viewholder.ItemViewHolder



class ItemsAdapter(private val listener: ClickListener): RecyclerView.Adapter<ItemViewHolder>() {
    private val resource = R.layout.car_row
    lateinit var context: Context
    private val itemList = mutableListOf<ListingsItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        context = parent.context
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: CarRowBinding = DataBindingUtil.inflate(layoutInflater, resource, parent, false)
        return ItemViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setItem(itemList[position])

        holder.itemView.setOnClickListener {
            listener.itemSelect(itemList[position])
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    fun setItems(list: MutableList<ListingsItem>) {
        itemList.clear()
        itemList.addAll(list)
        notifyDataSetChanged()
    }
}