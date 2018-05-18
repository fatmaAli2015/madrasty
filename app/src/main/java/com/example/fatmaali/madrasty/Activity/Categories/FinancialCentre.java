package com.example.fatmaali.madrasty.Activity.Categories;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.NewFinancialActivity;
import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.PreFinancialActivity;
import com.example.fatmaali.madrasty.R;

public class FinancialCentre extends AppCompatActivity {
    LinearLayout layoutCall, layoutMessages;
    private Toolbar toolbar;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_centre);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView=(TextView)findViewById(R.id.toolbar_title);
        titleTextView.setText("المراكز المالية");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }

        layoutCall = (LinearLayout) findViewById(R.id.linearCall);
        layoutMessages = (LinearLayout) findViewById(R.id.linearMessages);

        layoutCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent preFinancialIntent = new Intent(FinancialCentre.this, PreFinancialActivity.class);
                startActivity(preFinancialIntent);
            }
        });
        layoutMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newFinancialIntent = new Intent(FinancialCentre.this, NewFinancialActivity.class);
                startActivity(newFinancialIntent);
            }
        });

    }
}
