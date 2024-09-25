package com.example.hw5_m3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw5_m3.databinding.ItemMBinding;

import java.util.ArrayList;


public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {

    private ArrayList<Pizza> pizzas;


    public PizzaAdapter(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(ItemMBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.bind(pizzas.get(position));
    }

    @Override
    public int getItemCount() {
        return pizzas.size();
    }
}
