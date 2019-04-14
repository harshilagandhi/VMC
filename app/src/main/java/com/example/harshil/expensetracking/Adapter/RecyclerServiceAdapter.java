package com.example.harshil.expensetracking.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.model.Service;

import java.util.List;

public class RecyclerServiceAdapter extends RecyclerView.Adapter<RecyclerServiceAdapter.serviceHolder> {

    List<Service> serviceList;
    Service service;

    public RecyclerServiceAdapter(List<Service> serviceList){
        super();
        this.serviceList=serviceList;
    }

    @NonNull
    @Override
    public serviceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_list_service, parent, false);
        return new serviceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull serviceHolder holder, int position) {

        service = serviceList.get(position);
        holder.category.setText(service.getCategory());
//        holder.value.setText(service.getValue().toString());
//        holder.odometer.setText(service.getOdometer().toString());
        holder.date.setText(service.getDate());

    }

    @Override
    public int getItemCount() {
        return serviceList.size();
    }

    class serviceHolder extends RecyclerView.ViewHolder{


        TextView date,odometer,value,category;
        ImageView icon;

        public serviceHolder(View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.fserviceDate);
            odometer = (TextView) itemView.findViewById(R.id.fuelOdometer);
            value = (TextView) itemView.findViewById(R.id.servicevalue);
            category = (TextView) itemView.findViewById(R.id.servicetype);
            icon = (ImageView) itemView.findViewById(R.id.serviceicon);

        }
    }
}
