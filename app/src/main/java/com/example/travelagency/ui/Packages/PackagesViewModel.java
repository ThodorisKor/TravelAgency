package com.example.travelagency.ui.Packages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PackagesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PackagesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Packages fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}