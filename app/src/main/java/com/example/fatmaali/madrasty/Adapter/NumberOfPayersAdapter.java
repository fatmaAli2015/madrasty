package com.example.fatmaali.madrasty.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Models.ModelNumOfPayers;
import com.example.fatmaali.madrasty.R;

import java.util.List;

public class NumberOfPayersAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<ModelNumOfPayers> modelNumOfPayersList;

    Context mContext;

    public NumberOfPayersAdapter(List<ModelNumOfPayers> modelNumOfPayersList, Context mContext) {
        this.modelNumOfPayersList = modelNumOfPayersList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumOfPayersHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.payer_list_layout, parent, false), this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final ModelNumOfPayers modelNumOfPayers = modelNumOfPayersList.get(position);
        NumOfPayersHolder numOfPayersHolder = (NumOfPayersHolder) holder;

        numOfPayersHolder.textViewTitle.setText(modelNumOfPayers.getTxtTextTilte());
        numOfPayersHolder.textViewId.setText(modelNumOfPayers.getId()+"");
        numOfPayersHolder.editText_100.setText(modelNumOfPayers.getNumOfPayers100());
        numOfPayersHolder.editText_100.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelNumOfPayersList.get(position).numOfPayers100 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        numOfPayersHolder.editText_75.setText(modelNumOfPayers.getNumOfPayers75());
        numOfPayersHolder.editText_75.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelNumOfPayersList.get(position).numOfPayers75 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public List<ModelNumOfPayers> getModelNumOfPayersList() {
        return modelNumOfPayersList;
    }

    @Override
    public int getItemCount() {
        return modelNumOfPayersList.size();
    }

    public class NumOfPayersHolder extends RecyclerView.ViewHolder {
        public EditText editText_75, editText_100;
        public TextView textViewTitle, textViewId;
        public NumberOfPayersAdapter parent;

        public NumOfPayersHolder(View itemView, NumberOfPayersAdapter parent) {
            super(itemView);
            this.parent = parent;
            editText_75 = (EditText) itemView.findViewById(R.id.edtxt_75);
            editText_100 = (EditText) itemView.findViewById(R.id.edtxt_100);
            textViewTitle = (TextView) itemView.findViewById(R.id.TypeNumOfPayers);
            textViewId = (TextView) itemView.findViewById(R.id.TypeNumOfPayersId);

        }
    }
}
