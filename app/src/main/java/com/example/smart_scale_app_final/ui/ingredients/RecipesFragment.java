package com.example.smart_scale_app_final.ui.ingredients;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smart_scale_app_final.R;

import java.util.ArrayList;

public class RecipesFragment extends Fragment {

    private RecipesViewModel recipesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recipesViewModel =
                new ViewModelProvider(this).get(RecipesViewModel.class);

        View root = inflater.inflate(R.layout.fragment_recipes, container, false);

        final RecyclerView recyclerView = root.findViewById(R.id.recipeRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.requireContext(), LinearLayoutManager.VERTICAL, false));

        //create and add test data
        ArrayList<Ingredients> ingredientsList = new ArrayList();
        ingredientsList.add(new Ingredients("Tandoori Paste", "2", "tbsp"));
        ingredientsList.add(new Ingredients("Greek-style yoghurt", "1/2", "cup"));
        ingredientsList.add(new Ingredients("Paneer", "200", "g"));
        ingredientsList.add(new Ingredients("coconut oil", "1.5", "tbsp"));
        ingredientsList.add(new Ingredients("large red onion", "1", "whole"));
        ingredientsList.add(new Ingredients("large red capsicum", "1", "whole"));
        ingredientsList.add(new Ingredients("fresh mint leaves", "1/3", "cup"));
        ingredientsList.add(new Ingredients("wild rice", "250", "g"));
        ingredientsList.add(new Ingredients("baby spinach", "120", "g"));
        ingredientsList.add(new Ingredients("Lebanese cucumber", "1", "whole"));
        ingredientsList.add(new Ingredients("mini pappadums", "8", "whole"));
        ingredientsList.add(new Ingredients("lemon wedges", "10+", " "));

        recyclerView.setAdapter(new CustomAdapter(ingredientsList));

        final RecyclerView methodsRecyclerView = root.findViewById(R.id.methodRecyclerView);

        methodsRecyclerView.setLayoutManager(new LinearLayoutManager(this.requireContext(), LinearLayoutManager.VERTICAL, false));

        //create and add test data
        ArrayList<Methods> methodsList = new ArrayList();

        methodsList.add(new Methods("1", "Combine the tandoori paste and 1 tbs yoghurt in a bowl. Add the paneer. Stir to coat."));
        methodsList.add(new Methods("2", "Heat 1 tbs coconut oil in a non-stick frying pan over medium-high heat. Cook onion and capsicum, stirring occasionally, for 5 minutes or until softened. Add paneer mixture and remaining oil. Cook, stirring, for 2 minutes. Add 2 tbs water and cook for a further minute or until golden and heated through.\n"));
        methodsList.add(new Methods("3", "Meanwhile, combine the mint and the remaining yoghurt in a bowl. Season."));
        methodsList.add(new Methods("4", "Divide the rice, spinach, cucumber and paneer among serving plates. Serve with raita, pappadums and lemon wedges."));
        methodsList.add(new Methods("5", "Add a can of drained chickpeas along with the paneer in step 2 for an extra serve of veg and low-fat plant protein."));

        methodsRecyclerView.setAdapter(new MethodsAdapter(methodsList));


        return root;
    }
}