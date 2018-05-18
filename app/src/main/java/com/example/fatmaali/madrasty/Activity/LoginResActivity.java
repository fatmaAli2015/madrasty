package com.example.fatmaali.madrasty.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fatmaali.madrasty.Fragments.LoginFragment;
import com.example.fatmaali.madrasty.R;

public class LoginResActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_res);
        LoginFragment fragment = new LoginFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frameLoginReg, fragment, fragment.getTag())
                .commit();
    }
}
