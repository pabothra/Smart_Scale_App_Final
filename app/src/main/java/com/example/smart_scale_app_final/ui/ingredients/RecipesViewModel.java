package com.example.smart_scale_app_final.ui.ingredients;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecipesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RecipesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ingredients fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}