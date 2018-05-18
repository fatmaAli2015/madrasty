package com.example.fatmaali.madrasty.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fatmaali.madrasty.Models.ModelPreFinancialCentre;
import com.example.fatmaali.madrasty.R;

import java.util.List;

public class VRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<ModelPreFinancialCentre> mPreFinancialCentreList;

    public VRecyclerViewAdapter(List<ModelPreFinancialCentre> mPreFinancialCentre) {
        this.mPreFinancialCentreList = mPreFinancialCentre;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new V_ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ModelPreFinancialCentre model = mPreFinancialCentreList.get(position);

        V_ViewHolder v_viewHolder = (V_ViewHolder)holder;
        v_viewHolder.mTitle.setText(model.getTitleFinancialCentre());
        v_viewHolder.mType.setText(model.getTypeFinancialCentre());
        v_viewHolder.mDate.setText(model.getDateFinancialCentre());
        v_viewHolder.mPeriodFrom.setText(model.getPeriodFromFinancialCentre());
        v_viewHolder.mPeriodTo.setText(model.getPeriodToFinancialCentre());
    }


    @Override
    public int getItemCount() {
        return mPreFinancialCentreList.size();
    }
    public class V_ViewHolder extends RecyclerView.ViewHolder{
        TextView mTitle, mType , mDate , mPeriodTo ,mPeriodFrom;

        public V_ViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView)itemView.findViewById(R.id.TitleTextView);
            mType = (TextView)itemView.findViewById(R.id.typeFinancial);
            mDate =(TextView)itemView.findViewById(R.id.dateFinancial);
            mPeriodTo = (TextView)itemView.findViewById(R.id.periodTo);
            mPeriodFrom =(TextView)itemView.findViewById(R.id.periodFrom);
        }
    }
}
