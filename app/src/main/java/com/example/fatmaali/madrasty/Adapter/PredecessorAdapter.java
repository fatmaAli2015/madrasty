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

import com.example.fatmaali.madrasty.Activity.Categories.subCategoriesFinancial.branchesOfSubCat.Predecessor;
import com.example.fatmaali.madrasty.Models.ModelPredecessor;
import com.example.fatmaali.madrasty.R;

import java.util.List;

public class PredecessorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ModelPredecessor> modelPredecessorList;

    Context mContext;

    public PredecessorAdapter(List<ModelPredecessor> modelPredecessorList, Context mContext) {
        this.modelPredecessorList = modelPredecessorList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new predecessor(LayoutInflater.from(parent.getContext()).inflate(R.layout.predecessor_layout, parent, false), this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ModelPredecessor modelPredecessor = modelPredecessorList.get(position);
        predecessor predecessor = (predecessor) holder;

        predecessor.typePredecessor.setText(modelPredecessor.getTypePredecessor());
        predecessor.typePredecessorId.setText("" + modelPredecessor.getId());


        predecessor.predecessor1.setText(modelPredecessor.getPredecessor1());
        predecessor.predecessor1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPredecessorList.get(position).Predecessor1 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        predecessor.predecessor2.setText(modelPredecessor.getPredecessor2());
        predecessor.predecessor2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPredecessorList.get(position).Predecessor2 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        predecessor.predecessor3.setText(modelPredecessor.getPredecessor3());
        predecessor.predecessor3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPredecessorList.get(position).Predecessor3 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        predecessor.predecessor4.setText(modelPredecessor.getPredecessor4());
        predecessor.predecessor4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPredecessorList.get(position).Predecessor4 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        predecessor.predecessor5.setText(modelPredecessor.getPredecessor5());
        predecessor.predecessor5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPredecessorList.get(position).Predecessor5 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        predecessor.predecessor6.setText(modelPredecessor.getPredecessor6());
        predecessor.predecessor6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                modelPredecessorList.get(position).Predecessor6 = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
    public List<ModelPredecessor> getModelPredecessorList() {
        return modelPredecessorList;
    }
    @Override
    public int getItemCount() {
        return modelPredecessorList.size();
    }


    public class predecessor extends RecyclerView.ViewHolder {
        public EditText predecessor1, predecessor2, predecessor3,
                predecessor4, predecessor5, predecessor6;
        TextView typePredecessor, typePredecessorId;
        private PredecessorAdapter parent;

        public predecessor(View itemView, PredecessorAdapter parent) {
            super(itemView);
            this.parent = parent;
            typePredecessor = (TextView) itemView.findViewById(R.id.TypePredecessor);
            typePredecessorId = (TextView) itemView.findViewById(R.id.TypePredecessorId);
            predecessor1 = (EditText) itemView.findViewById(R.id.predecessor1);
            predecessor2 = (EditText) itemView.findViewById(R.id.predecessor2);
            predecessor3 = (EditText) itemView.findViewById(R.id.predecessor3);
            predecessor4 = (EditText) itemView.findViewById(R.id.predecessor4);
            predecessor5 = (EditText) itemView.findViewById(R.id.predecessor5);
            predecessor6 = (EditText) itemView.findViewById(R.id.predecessor6);


        }

    }


}