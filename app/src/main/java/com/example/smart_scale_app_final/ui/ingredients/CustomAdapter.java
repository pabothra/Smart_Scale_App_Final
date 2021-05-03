package com.example.smart_scale_app_final.ui.ingredients;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.smart_scale_app_final.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<Ingredients> localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView qty_tv;
        private final TextView units_tv;
        private final TextView ingName_tv;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            qty_tv = (TextView) view.findViewById(R.id.qty_tv);
            units_tv = (TextView) view.findViewById(R.id.units_tv);
            ingName_tv = (TextView) view.findViewById(R.id.ingName_tv);
        }

        public TextView getTvQuantity() {return qty_tv ;}
        public TextView getTvUnits() {
            return units_tv;
        }
        public TextView getTvName() {
            return ingName_tv;
        }

    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public CustomAdapter(ArrayList<Ingredients> dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.ingredient_text_field, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Ingredients ingredients = localDataSet.get(position);

        viewHolder.getTvQuantity().setText(ingredients.qty);
        viewHolder.getTvUnits().setText(ingredients.units);
        viewHolder.getTvName().setText(ingredients.name);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}



