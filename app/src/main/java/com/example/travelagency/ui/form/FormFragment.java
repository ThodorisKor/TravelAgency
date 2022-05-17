package com.example.travelagency.ui.form;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.travelagency.R;
import com.example.travelagency.databinding.FragmentFormBinding;
import com.example.travelagency.databinding.FragmentPackagesBinding;

public class FormFragment extends Fragment {

    private FragmentFormBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFormBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Toast.makeText(getActivity(),"MIAOU",Toast.LENGTH_SHORT).show();
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}