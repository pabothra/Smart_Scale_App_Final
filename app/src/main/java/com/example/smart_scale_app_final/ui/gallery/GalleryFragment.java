package com.example.smart_scale_app_final.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.smart_scale_app_final.R;
import com.google.android.material.snackbar.Snackbar;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private TextView txtview;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        setHasOptionsMenu(true);

        txtview = root.findViewById(R.id.textView2);
        txtview.setText("Cool it works");

        return root;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.recipe_menu, menu);
        MenuItem item = menu.findItem(R.id.action_settings);
        MenuItem addRecipeButton = menu.findItem(R.id.action_add_recipe);
        item.setVisible(false);
        super.onPrepareOptionsMenu(menu);

        addRecipeButton.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getActivity(), "Clicked!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }


}