package com.example.harshil.expensetracking.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.model.Expense;

import java.util.List;

public class RecyclerExpenseAdapter extends RecyclerView.Adapter<RecyclerExpenseAdapter.expenseHolder> {

    List<Expense> expenseList;
    Expense expense;

    public RecyclerExpenseAdapter(List<Expense> expenseList){

        this.expenseList=expenseList;

    }

    @NonNull
    @Override
    public expenseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_expenselist, parent, false);

        return new expenseHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull expenseHolder holder, int position) {

        expense = expenseList.get(position);
        holder.date.setText(expense.getDate());
        holder.location.setText(expense.getLocation());
        holder.type.setText(expense.getCategory());
        holder.value.setText(expense.getValue());
    }

    @Override
    public int getItemCount() {
        return expenseList.size();
    }

    class expenseHolder extends RecyclerView.ViewHolder{
        TextView date,value,type,location;

        public expenseHolder(View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.fexpenseDate);
            value = (TextView) itemView.findViewById(R.id.expensevalue);
            type = (TextView) itemView.findViewById(R.id.expensetype);
            location = (TextView) itemView.findViewById(R.id.location);
        }
    }
}
