package com.example.harshil.expensetracking.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.model.Fuel;

import java.util.List;

public class RecyclerFuelAdapter extends RecyclerView.Adapter<RecyclerFuelAdapter.fuelHolder> {


    List<Fuel> fuelList;
    Fuel fuel;

    public RecyclerFuelAdapter(List<Fuel> fuelList){

        this.fuelList=fuelList;

    }
    @NonNull
    @Override
    public fuelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_list_refueling, parent, false);
        return new fuelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull fuelHolder holder, int position) {

        fuel = fuelList.get(position);
        holder.date.setText(fuel.getDate());
        holder.cost.setText(fuel.getCost());
        holder.gasstation.setText(fuel.getGasstation());
        holder.odometer.setText(fuel.getOdometer());

    }

    @Override
    public int getItemCount() {
        return fuelList.size();
    }

    class fuelHolder extends RecyclerView.ViewHolder{

        TextView date,cost,odometer,gasstation;

        public fuelHolder(View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.fuelDate);
            cost = (TextView) itemView.findViewById(R.id.cost);
            odometer = (TextView) itemView.findViewById(R.id.fuelOdometer);
            gasstation = (TextView) itemView.findViewById(R.id.gasstaion);
        }
    }
}
