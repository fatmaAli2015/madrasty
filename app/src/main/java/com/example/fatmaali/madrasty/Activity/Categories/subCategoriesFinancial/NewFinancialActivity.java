package com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Adapter.VStaticRecyclerAdapter;
import com.example.fatmaali.madrasty.Models.ModelNewFinancialCentre;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;

public class NewFinancialActivity extends AppCompatActivity {
    private ArrayList<ModelNewFinancialCentre> mProducts;
    private Toolbar toolbar;
    private TextView titleTextView;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_financial);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView = (TextView) findViewById(R.id.toolbar_title);
        titleTextView.setText(R.string.financialCentre);
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace_black_24dp);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        scrollView.post(new Runnable() {
            public void run() {
                scrollView.fullScroll(scrollView.FOCUS_UP);
                scrollView.pageScroll(View.FOCUS_UP);
            }
        });
        mProducts = new ArrayList<>();
        initRecyclerView();
        getDate();
    }

    private void getDate() {
        mProducts.add(new ModelNewFinancialCentre(R.drawable.basicinf, R.string.basicInformation, R.string.one));
        mProducts.add(new ModelNewFinancialCentre(R.drawable.predecessor, R.string.predecessor, R.string.two));
        mProducts.add(new ModelNewFinancialCentre(R.drawable.numberofpayers, R.string.NumberOfPayers, R.string.three));
        mProducts.add(new ModelNewFinancialCentre(R.drawable.previousbalance, R.string.previousBalance, R.string.four));
        mProducts.add(new ModelNewFinancialCentre(R.drawable.otherdeposits, R.string.OtherDeposits, R.string.five));
        mProducts.add(new ModelNewFinancialCentre(R.drawable.printing, R.string.printing, R.string.six));

    }


    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerViewFin);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        VStaticRecyclerAdapter adapter = new VStaticRecyclerAdapter(mProducts, this);
        recyclerView.setAdapter(adapter);

    }
}
