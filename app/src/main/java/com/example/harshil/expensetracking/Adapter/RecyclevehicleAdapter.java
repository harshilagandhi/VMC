package com.example.harshil.expensetracking.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.Vehicle_List;
import com.example.harshil.expensetracking.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RecyclevehicleAdapter extends RecyclerView.Adapter<RecyclevehicleAdapter.vehicleViewHolder>
{
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    Vehicle vehicle;


    public RecyclevehicleAdapter(ArrayList<Vehicle> vehicleList){

        this.vehicleList= (ArrayList<Vehicle>) vehicleList;
    }

    @NonNull
    @Override
    public vehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_vehiclelistitem, parent, false);
        vehicleViewHolder vehicleViewHolder = new vehicleViewHolder(view);
        return vehicleViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull vehicleViewHolder holder, int position) {

        vehicle = vehicleList.get(position);
        holder.vehicleModel.setText(vehicle.getVehiclemodel());
        holder.vehicleManufacturer.setText(vehicle.getVehiclemanufacturer());
        holder.plateNumber.setText(vehicle.getVehicleplates());
        holder.buyingYear.setText(vehicle.getYear());
//        notifyDataSetChanged();


    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class vehicleViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener{

        TextView vehicleModel,vehicleManufacturer,plateNumber,buyingYear;

        public vehicleViewHolder(View itemView) {
            super(itemView);

            vehicleModel = (TextView) itemView.findViewById(R.id.vehiclemodel);
            vehicleManufacturer = (TextView) itemView.findViewById(R.id.vehicleMenufacturer);
            plateNumber = (TextView) itemView.findViewById(R.id.vehiclePlateNumber);
            buyingYear = (TextView) itemView.findViewById(R.id.vehicleBuyYear);
            itemView.setOnCreateContextMenuListener(this);



        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select An Option");
            menu.add(this.getAdapterPosition(),121,0,"View");
            menu.add(this.getAdapterPosition(),122,1,"Update");
            menu.add(this.getAdapterPosition(),123,2,"Delete");

            

        }
    }


}
