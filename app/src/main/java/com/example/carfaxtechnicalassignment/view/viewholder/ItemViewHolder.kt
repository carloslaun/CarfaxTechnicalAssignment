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
            view.year = " "+ model.year.toString() +" "+ model.make +" "+ model.model +" "+ model.trim
            view.city = "  " + model.dealer?.city + ", " + model.dealer?.state
            view.price = " $ " + model.currentPrice.toString() + "  | " + model.mileage.toString() + "k mi"


            Glide.with(view.root.context).load(model.images?.firstPhoto?.large).into(view.imgCharacter)
        }
    }
}