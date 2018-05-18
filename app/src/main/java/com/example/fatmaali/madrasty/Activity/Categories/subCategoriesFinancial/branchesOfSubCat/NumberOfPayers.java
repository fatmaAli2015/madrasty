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

import com.example.fatmaali.madrasty.Adapter.NumberOfPayersAdapter;
import com.example.fatmaali.madrasty.Adapter.PredecessorAdapter;
import com.example.fatmaali.madrasty.Models.ModelNumOfPayers;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.fatmaali.madrasty.Other.ArrayStringNames.names;

public class NumberOfPayers extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView titleTextView;
    RecyclerView recyclerView;
    NumberOfPayersAdapter adapter;
    ArrayList<ModelNumOfPayers> mProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_payers);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView = (TextView) findViewById(R.id.toolbar_title);

        titleTextView.setText(R.string.NumberOfPayers);

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
        for (int j = 0; j < names.length; j++) {

            mProducts.add(new ModelNumOfPayers("", "",
                    names[j], j));

        }
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recylerViewFinScrolling);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        adapter = new NumberOfPayersAdapter(mProducts, this);
        recyclerView.setAdapter(adapter);

    }

    public void NumberOfPayers(View view) {
        List<ModelNumOfPayers> AllData = adapter.getModelNumOfPayersList();
        int NumberOfPayers75 = 0, NumberOfPayers100 = 0, g = 0;
        for (int i = 0; i < AllData.size(); i++) {
            if (AllData.get(i).numOfPayers75 != "") {
                NumberOfPayers75 += Integer.parseInt(String.valueOf(AllData.get(i).numOfPayers75));
            }
            if (AllData.get(i).numOfPayers100 != "") {
                NumberOfPayers100 += Integer.parseInt(String.valueOf(AllData.get(i).numOfPayers100));
            }
        }
        g += NumberOfPayers75 + NumberOfPayers100;
        Toast.makeText(this, g + "", Toast.LENGTH_LONG).show();
    }
}
