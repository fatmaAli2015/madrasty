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

import com.example.fatmaali.madrasty.Models.ModelPreviousBalance;
import com.example.fatmaali.madrasty.R;

import java.util.ArrayList;
import java.util.List;

public class PreviousBalanceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ModelPreviousBalance> modelPreviousBalanceList;
    ArrayList<ModelPreviousBalance> modelBalanceList;

    Context mContext;

    public PreviousBalanceAdapter(List<ModelPreviousBalance> modelPreviousBalanceList, Context mContext) {
        this.modelPreviousBalanceList = modelPreviousBalanceList;
        this.mContext = mContext;
    }

//    public PreviousBalanceAdapter(ArrayList<ModelPreviousBalance> modelBalanceList, Context mContext) {
//        this.modelBalanceList = modelBalanceList;
//        this.mContext = mContext;
//    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PreviousBalanceHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.previous_balance_list_layout, parent, false), this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ModelPreviousBalance modelPreviousBalance = modelPreviousBalanceList.get(position);
        PreviousBalanceHolder mBalanceHolder = (PreviousBalanceHolder) holder;
        mBalanceHolder.textViewTitle.setText(modelPreviousBalance.getTitlePreviousBalance());
        mBalanceHolder.textViewId.setText(modelPreviousBalance.getId() + "");
        mBalanceHolder.editText_0.setText(modelPreviousBalance.getEditPreviousBalance());
        mBalanceHolder.editText_0.addTextChangedListener(new TextWatcher() {
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

    public class PreviousBalanceHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewId;
        EditText editText_0;
        PreviousBalanceAdapter parent;

        public PreviousBalanceHolder(View itemView, PreviousBalanceAdapter parent) {
            super(itemView);
            this.parent = parent;
            textViewTitle = (TextView) itemView.findViewById(R.id.TypeBalance);
            textViewId = (TextView) itemView.findViewById(R.id.TypeBalanceId);
            editText_0 = (EditText) itemView.findViewById(R.id.edtxt_0);
        }
    }

}
