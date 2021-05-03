package com.example.smart_scale_app_final.ui.ingredients;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.smart_scale_app_final.R;

import java.util.ArrayList;

public class MethodsAdapter extends RecyclerView.Adapter<MethodsAdapter.ViewHolder> {

    private ArrayList<Methods> methodsDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView stepNum_tv;
        private final TextView methodDesc_tv;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            stepNum_tv = (TextView) view.findViewById(R.id.stepNum_tv);
            methodDesc_tv = (TextView) view.findViewById(R.id.methodDesc_tv);
        }
        public TextView getTvStepNum() {return stepNum_tv ;}
        public TextView getTvUnits() {
            return methodDesc_tv;
        }

    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet2 String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public MethodsAdapter(ArrayList<Methods> dataSet2) {
        methodsDataSet = dataSet2;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.methods_text_field, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Methods methods = methodsDataSet.get(position);

        viewHolder.getTvStepNum().setText(methods.stepNum);
        viewHolder.getTvUnits().setText(methods.methodDescription);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return methodsDataSet.size();
    }
}



