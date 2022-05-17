package com.example.travelagency.ui.Packages;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.travelagency.MainActivity;
import com.example.travelagency.R;

import com.example.travelagency.databinding.FragmentFormBinding;
import com.example.travelagency.databinding.FragmentPackagesBinding;
import com.example.travelagency.ui.form.FormFragment;
import com.example.travelagency.ui.form.FormFragment;

public class PackagesFragment extends Fragment {
    private FragmentPackagesBinding binding;
    private CardView card1;
    private CardView card2;
    private CardView card3;
    private CardView card4;
    private CardView card5;
    private CardView card6;
    private CardView card7;
    private CardView card8;
    private CardView card9;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPackagesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        /** Below ,  we make a cardView , thats takes the cardView with id 'card1'
         * We set a onclick listener , that when the user clicks inside the 'card1'
         * To activate the listener and we call the anonymous method "onClick(View view)"
         * And inside her we create a form Fragment with the name 'frag'
         * And we call the method "replaceFragment('Fragment_Name')" and replaces the current
         * Fragment with the Fragment we want to saw inside the container.Simple */

        card1 = binding.card1;
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),cardView.isPressed(),Toast.LENGTH_SHORT).show();
                System.out.println(card1.isPressed());
                Fragment frag = new FormFragment();
                replaceFragment(frag);
                //FragmentFormBinding.bind(View.inflate(bd.navForm,R.layout.fragment_form, M\));
            }
        });

        /**
         * CAREFUL : binding.<the_id_of_CardView>
         *     with the "binding" we connect the element of .xml to the .java file(i'm NOT 100% sure tho)*/
        card2 = binding.card2;
        card2.setOnClickListener(view -> {
            System.out.println(card2.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card3 = binding.card3;
        card3.setOnClickListener(view -> {
            System.out.println(card3.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card4 = binding.card4;
        card4.setOnClickListener(view -> {
            System.out.println(card4.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card5 = binding.card5;
        card5.setOnClickListener(view -> {
            System.out.println(card5.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card6 = binding.card6;
        card6.setOnClickListener(view -> {
            System.out.println(card6.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card7 = binding.card7;
        card7.setOnClickListener(view -> {
            System.out.println(card7.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card8 = binding.card8;
        card8.setOnClickListener(view -> {
            System.out.println(card8.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        card9 = binding.card9;
        card9.setOnClickListener(view -> {
            System.out.println(card9.isPressed());
            Fragment frag = new FormFragment();
            replaceFragment(frag);
        });
        return root;
    }
    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment_content_main, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}