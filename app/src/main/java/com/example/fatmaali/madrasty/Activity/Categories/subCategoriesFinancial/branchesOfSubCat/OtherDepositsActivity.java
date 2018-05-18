package com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fatmaali.madrasty.Adapter.OtherDepositsAdapter;
import com.example.fatmaali.madrasty.Adapter.PreviousBalanceAdapter;
import com.example.fatmaali.madrasty.Models.ModelPreviousBalance;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.fatmaali.madrasty.Other.ArrayStringNames.names;

public class OtherDepositsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView titleTextView;
    RecyclerView recyclerView;
    ArrayList<ModelPreviousBalance> mProducts;
    OtherDepositsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_deposits);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView = (TextView) findViewById(R.id.toolbar_title);
        titleTextView.setText(R.string.OtherDeposits);
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
        adapter = new OtherDepositsAdapter(mProducts, this);
        recyclerView.setAdapter(adapter);
    }

    public void OtherDeposits(View view) {
        List<ModelPreviousBalance> allData = adapter.getModelPreviousBalanceList();
        int g = 0, OtherDeposits_0 = 0;
        for (int i = 0; i < allData.size(); i++) {
            if (allData.get(i).EditPreviousBalance != "") {
                OtherDeposits_0 += Integer.parseInt(String.valueOf(allData.get(i).EditPreviousBalance));
            }
        }
        g += OtherDeposits_0;
        Toast.makeText(this, "" + g, Toast.LENGTH_SHORT).show();
    }
}
