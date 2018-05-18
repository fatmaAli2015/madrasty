package com.example.fatmaali.madrasty.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fatmaali.madrasty.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends Fragment {
    View view;
    TextView textView;

    public RegistrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_registration, container, false);
        textView = (TextView) view.findViewById(R.id.login);
        init();
        return view;
    }
    public void init() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLoginReg, new LoginFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
