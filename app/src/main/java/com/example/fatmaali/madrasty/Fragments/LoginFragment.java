package com.example.fatmaali.madrasty.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Activity.CustomNavigation;
import com.example.fatmaali.madrasty.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    View view;
    TextView textView;
    TextView nextToProject;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
        textView = (TextView) view.findViewById(R.id.next);
        nextToProject = (TextView) view.findViewById(R.id.nextToProject);

        init();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void init() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLoginReg, new RegistrationFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        nextToProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextToProjectIntent = new Intent(getActivity(), CustomNavigation.class);
                startActivity(nextToProjectIntent);
            }
        });
    }
}

