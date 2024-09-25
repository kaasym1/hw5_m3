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
        pizzas.add(new Pizza("Мясная с аджикой", "Моцарелла, смесь сыров чеддер и пармезан, соус альфредо", "https://media.dodostatic.net/image/r:292x292/11EF6612D8805B8FA33D45115AFF17C7.avif"));
        pizzas.add(new Pizza("Креветки со сладким чили", "Ветчина из цыпленка, увеличенная порция моцареллы, соус альфредо", "https://media.dodostatic.net/image/r:292x292/11EF33DC750FF17794FB1ACA35F22A6E.avif"));
        pizzas.add(new Pizza("Баварская", "Двойная порция цыпленка, моцарелла, соус альфредо", "https://media.dodostatic.net/image/r:292x292/11EF346408A39615BD3478135F9F6673.avif"));
        pizzas.add(new Pizza("Чикен Бомбони","Увеличенная порция моцареллы, томаты, итальянские травы, томатный соус","https://media.dodostatic.net/image/r:292x292/11EF3DB2188200718EDEB6D5EC3E3ECD.avif"));
        pizzas.add(new Pizza("Сырная \uD83C\uDF31\uD83D\uDC76","Донерное мясо из говядины, моцарелла, томаты, красный лук, соленые огурчики, соус ранч, томатный соус","https://media.dodostatic.net/image/r:292x292/11EE7D600BC7B9F1B6888AF021E5C198.avif"));
        pizzas.add(new Pizza("Ветчина и сыр \uD83D\uDC76","Цыпленок, моцарелла, кубики брынзы, томаты, соус песто, соус альфредо","https://media.dodostatic.net/image/r:292x292/11EE7D60109D7D49BF0AC5BCAD0F9679.avif"));
        pizzas.add(new Pizza("Двойной цыпленок \uD83D\uDC76","Ветчина из цыпленка, моцарелла, смесь сыров чеддер и пармезан, томаты, красный лук, чеснок сухой, итальянские травы, соус альфредо","https://media.dodostatic.net/image/r:292x292/11EE7D601DD7A15C85B8F38026F12402.avif"));
        pizzas.add(new Pizza("Маргарита \uD83C\uDF31","Цыпленок, ветчина из цыпленка, пепперони из цыпленка, колбаски чоризо из цыпленка, моцарелла, томатный соус","https://media.dodostatic.net/image/r:292x292/11EE7D5FFA55D940A5174B17EE35C316.avif"));
        pizzas.add(new Pizza("Кебаб Пицца","Охотничьи колбаски, острый соус аджика, колбаски чоризо из цыпленка, цыпленок , пепперони из цыпленка , моцарелла, томатный соус","https://media.dodostatic.net/image/r:292x292/11EE7D5FFA55D940A5174B17EE35C316.avif"));
    }
}