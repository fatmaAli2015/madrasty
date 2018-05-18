package com.example.fatmaali.madrasty.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.BasicInformation;
import com.example.fatmaali.madrasty.Activity.Categories.FinancialCentre;
import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.NumberOfPayers;
import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.OtherDepositsActivity;
import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.Predecessor;
import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.PreviousBalance;
import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.PrintingActivity;
import com.example.fatmaali.madrasty.Models.ModelNewFinancialCentre;
import com.example.fatmaali.madrasty.R;

import java.util.List;

public class VStaticRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ModelNewFinancialCentre> mNewFinancialCentres;
    Context mCon;


    public VStaticRecyclerAdapter(List<ModelNewFinancialCentre> mNewFinancialCentres, Context mCon) {
        this.mCon = mCon;
        this.mNewFinancialCentres = mNewFinancialCentres;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolderAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.static_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ModelNewFinancialCentre model = mNewFinancialCentres.get(position);
        ViewHolderAdapter viewHolderAdapter = (ViewHolderAdapter) holder;
        viewHolderAdapter.imageView.setBackgroundResource(model.getmImage());
        viewHolderAdapter.textViewTitle.setText(model.getmTitle());
        viewHolderAdapter.textViewNum.setText(model.getmNum());


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            if (position == 0) {
                viewHolderAdapter.linearLayout.setBackgroundResource(R.drawable.btnbg1);
                viewHolderAdapter.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCon.startActivity(new Intent(mCon, BasicInformation.class));
                    }
                });

            } else if (position == 1) {
                viewHolderAdapter.linearLayout.setBackgroundResource(R.drawable.btnbg2);
                viewHolderAdapter.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCon.startActivity(new Intent(mCon, Predecessor.class));

                    }
                });
            } else if (position == 2) {
                viewHolderAdapter.linearLayout.setBackgroundResource(R.drawable.btnbg3);
                viewHolderAdapter.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCon.startActivity(new Intent(mCon, NumberOfPayers.class));

                    }
                });
            } else if (position == 3) {
                viewHolderAdapter.linearLayout.setBackgroundResource(R.drawable.btnbg4);
                viewHolderAdapter.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCon.startActivity(new Intent(mCon, PreviousBalance.class));
                    }
                });
            } else if (position == 4) {
                viewHolderAdapter.linearLayout.setBackgroundResource(R.drawable.btnbg5);
                viewHolderAdapter.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCon.startActivity(new Intent(mCon, OtherDepositsActivity.class));
                    }
                });
            } else {
                viewHolderAdapter.linearLayout.setBackgroundResource(R.drawable.btnbg6);
                viewHolderAdapter.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCon.startActivity(new Intent(mCon, PrintingActivity.class));
                    }
                });

            }
        }

    }

    @Override
    public int getItemCount() {
        return mNewFinancialCentres.size();
    }

    public class ViewHolderAdapter extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewTitle, textViewNum;
        LinearLayout linearLayout;

        public ViewHolderAdapter(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageStatic);
            textViewTitle = (TextView) itemView.findViewById(R.id.txtStatic);
            textViewNum = (TextView) itemView.findViewById(R.id.txtStaticNum);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearStatic);
        }
    }
}
