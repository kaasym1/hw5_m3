package com.example.hw5_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw5_m3.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private final ArrayList<Pizza> pizzas = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        PizzaAdapter adapter = new PizzaAdapter(pizzas);
        binding.rvList.setAdapter(adapter);
        initAdapter();
    }

    private void initAdapter() {
        pizzas.add(new Pizza("Pizza1", "pizza", "https://t3.ftcdn.net/jpg/06/27/23/56/360_F_627235669_iz0O2leKYRzjxAKdFP7odpp9eCOZREtN.jpg"));
        pizzas.add(new Pizza("Pizza1", "pizza", "https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png"));
        pizzas.add(new Pizza("Pizza1", "pizza", "https://static.vecteezy.com/system/resources/thumbnails/027/141/485/small_2x/pizza-created-with-generative-ai-png.png"));
    }
}