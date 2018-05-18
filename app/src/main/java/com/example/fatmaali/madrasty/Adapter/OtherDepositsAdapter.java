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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Models.ModelPreviousBalance;
import com.example.fatmaali.madrasty.R;

import java.util.List;

public class OtherDepositsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<ModelPreviousBalance> modelPreviousBalanceList;
    Context mContext;

    public OtherDepositsAdapter(List<ModelPreviousBalance> modelPreviousBalanceList, Context mContext) {
        this.modelPreviousBalanceList = modelPreviousBalanceList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OtherDepositsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.previous_balance_list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ModelPreviousBalance modelPreviousBalance = modelPreviousBalanceList.get(position);
        OtherDepositsHolder depositsHolder = (OtherDepositsHolder) holder;
        depositsHolder.textViewTitle.setText(modelPreviousBalance.getTitlePreviousBalance());
        depositsHolder.textViewId.setText(modelPreviousBalance.getId() + "");
        depositsHolder.editText_0.setText(modelPreviousBalance.getEditPreviousBalance());
        depositsHolder.editText_0.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPreviousBalanceList.get(position).EditPreviousBalance = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public List<ModelPreviousBalance> getModelPreviousBalanceList() {
        return modelPreviousBalanceList;
    }

    @Override
    public int getItemCount() {
        return modelPreviousBalanceList.size();
    }

    public class OtherDepositsHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle, textViewId;
        public EditText editText_0;

        public OtherDepositsHolder(View itemView) {
            super(itemView);
            textViewTitle = (TextView) itemView.findViewById(R.id.TypeBalance);
            textViewId = (TextView) itemView.findViewById(R.id.TypeBalanceId);
            editText_0 = (EditText) itemView.findViewById(R.id.edtxt_0);
        }
    }
}
