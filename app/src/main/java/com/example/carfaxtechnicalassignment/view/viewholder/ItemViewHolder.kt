package com.example.carfaxtechnicalassignment.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carfaxtechnicalassignment.databinding.CarRowBinding
import com.example.carfaxtechnicalassignment.model.ListingsItem

class ItemViewHolder(binding: CarRowBinding): RecyclerView.ViewHolder(binding.root) {
    private var binding: CarRowBinding? = null

    init{
        this.binding = binding
    }
    fun setItem(model: ListingsItem) {
        binding?.let { view->
            view.model = model.model
            view.year = model.year.toString()
            view.city = model.dealer?.city + ","
            view.make = model.make
            view.mileage = model.mileage.toString() + "k mi"
            view.price = "$" + model.currentPrice.toString() + " |"
            view.state = model.dealer?.state
            view.trim = model.trim


            Glide.with(view.root.context).load(model.images?.firstPhoto?.large).into(view.imgCharacter)
        }
    }
}