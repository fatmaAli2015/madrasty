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

import com.example.fatmaali.madrasty.Adapter.PredecessorAdapter;
import com.example.fatmaali.madrasty.Models.ModelPredecessor;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.fatmaali.madrasty.Other.ArrayStringNames.names;

public class Predecessor extends AppCompatActivity {

    private ArrayList<ModelPredecessor> mProducts;
    private PredecessorAdapter adapter;

    RecyclerView recyclerView;
    private Toolbar toolbar;
    private TextView titleTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predecessor);

        mProducts = new ArrayList<>();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        titleTextView = (TextView) findViewById(R.id.toolbar_title);

        titleTextView.setText(R.string.predecessor);

        toolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace_black_24dp);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }


        initRecyclerView();
        getDate();
    }

    private void getDate() {
        for (int j = 0; j < names.length; j++) {

            mProducts.add(new ModelPredecessor("", "",
                    "", "", "", "", names[j], j));

        }
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recylerViewFinScrolling);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        adapter = new PredecessorAdapter(mProducts, this);
        recyclerView.setAdapter(adapter);

    }

    public void predecessor(View view) {
        List<ModelPredecessor> allData = adapter.getModelPredecessorList();
        int predecessor1 = 0;
        int predecessor2 = 0;
        int predecessor3 = 0;
        int predecessor4 = 0;
        int predecessor5 = 0;
        int predecessor6 = 0;
        int g = 0;
        for (int i = 0; i < allData.size(); i++) {
            if (allData.get(i).Predecessor1 != "")
                predecessor1 += Integer.parseInt(String.valueOf(allData.get(i).Predecessor1));
            if (allData.get(i).Predecessor2 != "")
                predecessor2 += Integer.parseInt(String.valueOf(allData.get(i).Predecessor2));
            if (allData.get(i).Predecessor3 != "")
                predecessor3 += Integer.parseInt(String.valueOf(allData.get(i).Predecessor3));
            if (allData.get(i).Predecessor4 != "")
                predecessor4 += Integer.parseInt(String.valueOf(allData.get(i).Predecessor4));
            if (allData.get(i).Predecessor5 != "")
                predecessor5 += Integer.parseInt(String.valueOf(allData.get(i).Predecessor5));
            if (allData.get(i).Predecessor6 != "")
                predecessor6 += Integer.parseInt(String.valueOf(allData.get(i).Predecessor6));

        }
        g += predecessor1 + predecessor2 + predecessor3 + predecessor4 + predecessor5 + predecessor6;
        Toast.makeText(Predecessor.this, g + "", Toast.LENGTH_LONG).show();


    }
}
