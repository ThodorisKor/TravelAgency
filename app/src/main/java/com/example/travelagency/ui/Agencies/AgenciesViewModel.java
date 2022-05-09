package com.example.travelagency.ui.Agencies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgenciesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AgenciesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Agencies fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}