package com.example.travelagency.ui.Destinations;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DestinationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DestinationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Destinations fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}