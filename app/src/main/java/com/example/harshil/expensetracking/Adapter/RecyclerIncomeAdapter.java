package com.example.harshil.expensetracking.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.model.Income;

import java.util.ArrayList;
import java.util.List;

public class RecyclerIncomeAdapter extends RecyclerView.Adapter<RecyclerIncomeAdapter.incomeViewHolder> {

    List<Income> incomeList;
    Income income;

    public  RecyclerIncomeAdapter(ArrayList<Income> incomeList){

        this.incomeList=incomeList ;

    }

    @NonNull
    @Override
    public incomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_incomelist,parent,false);
        return new incomeViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull incomeViewHolder holder, int position) {

        income = incomeList.get(position);
        holder.incomeDate.setText(income.getDate().toString());
        holder.incomeValue.setText(income.getValues());
        holder.incomeType.setText(income.getCategory());
        holder.odometer.setText(income.getOdometer());

    }

    @Override
    public int getItemCount() {
        return incomeList.size();
    }

    class incomeViewHolder extends RecyclerView.ViewHolder{

        TextView incomeDate,incomeValue,incomeType,odometer;
        ImageView incomeIcon;

        public incomeViewHolder(View itemView) {
            super(itemView);

            incomeDate = itemView.findViewById(R.id.fincomeDate);
            incomeValue = itemView.findViewById(R.id.incomevalue);
            incomeType = (TextView) itemView.findViewById(R.id.incometype);
            odometer = (TextView) itemView.findViewById(R.id.Odometer);
            incomeIcon = (ImageView) itemView.findViewById(R.id.incomeicon);

        }
    }
}
