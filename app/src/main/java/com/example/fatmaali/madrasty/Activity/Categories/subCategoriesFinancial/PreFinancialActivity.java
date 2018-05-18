package com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Adapter.VRecyclerViewAdapter;
import com.example.fatmaali.madrasty.Models.ModelPreFinancialCentre;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;

public class PreFinancialActivity extends AppCompatActivity {
    private ArrayList<ModelPreFinancialCentre> mProducts;
    private Toolbar toolbar;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_financial);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView=(TextView)findViewById(R.id.toolbar_title);
        titleTextView.setText(R.string.financialCentre);
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace_black_24dp);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }


        mProducts = new ArrayList<>();
        initRecyclerView();
        getDate();
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerViewFin);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        VRecyclerViewAdapter adapter = new VRecyclerViewAdapter( mProducts);
        recyclerView.setAdapter(adapter);

    }
    private void getDate(){
        mProducts.add(new ModelPreFinancialCentre("title","type",
                "15-3-2018","12-1","12-5"));
        mProducts.add(new ModelPreFinancialCentre("title","type",
                "15-3-2018","12-1","12-5"));
    }
}
