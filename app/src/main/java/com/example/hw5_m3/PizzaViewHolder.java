package com.example.hw5_m3;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw5_m3.databinding.ItemMBinding;

public class PizzaViewHolder extends RecyclerView.ViewHolder {

    private ItemMBinding binding;

    public PizzaViewHolder(ItemMBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Pizza pizza) {
        binding.tvContactname.setText(pizza.getName());
        binding.tvDesc.setText(pizza.getDesc());
        Glide.with(binding.imgAva).load(pizza.getImage()).into(binding.imgAva);
    }
}
