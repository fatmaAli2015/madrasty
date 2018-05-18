package com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fatmaali.madrasty.Adapter.PreviousBalanceAdapter;
import com.example.fatmaali.madrasty.Adapter.VStaticRecyclerAdapter;
import com.example.fatmaali.madrasty.Models.ModelNewFinancialCentre;
import com.example.fatmaali.madrasty.Models.ModelPreviousBalance;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.fatmaali.madrasty.Other.ArrayStringNames.names;

public class PreviousBalance extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView titleTextView;
    RecyclerView recyclerView;
    ArrayList<ModelPreviousBalance> mProducts;
    PreviousBalanceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_balance);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView = (TextView) findViewById(R.id.toolbar_title);

        titleTextView.setText(R.string.previousBalance);

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

    private void getDate() {
        for (int i = 0; i < names.length; i++) {
            mProducts.add(new ModelPreviousBalance(names[i], "", i));
        }

    }


    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recylerViewFinScrolling);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new PreviousBalanceAdapter(mProducts, this);
        recyclerView.setAdapter(adapter);

    }

    public void PreviousBalanceClick(View view) {
        List<ModelPreviousBalance> allData = adapter.getModelPreviousBalanceList();
        int g = 0, exTxtBalance = 0;
        for (int i = 0; i < allData.size(); i++) {
            if (allData.get(i).EditPreviousBalance != "") {
                exTxtBalance += Integer.parseInt(String.valueOf(allData.get(i).EditPreviousBalance));
            }
        }
        g = exTxtBalance;
        Toast.makeText(this, "" + g, Toast.LENGTH_SHORT).show();
    }
}
