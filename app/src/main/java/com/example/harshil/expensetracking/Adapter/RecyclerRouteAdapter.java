package com.example.harshil.expensetracking.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.model.Route;

import java.util.ArrayList;
import java.util.List;

public class RecyclerRouteAdapter extends RecyclerView.Adapter<RecyclerRouteAdapter.routeHolder> {

    List<Route> routeList;
    Route route;

    public RecyclerRouteAdapter(List<Route> routeList){
        this.routeList=routeList;
    }

    @NonNull
    @Override
    public routeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_listroute_list,parent,false);
        return new  routeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull routeHolder holder, int position) {

        route = routeList.get(position);
        holder.startlocation.setText(route.getStartLocation());
        holder.endlocation.setText(route.getEndLocation());
        holder.startodomeetr.setText(route.getStartOdometer());
        holder.endodometer.setText(route.getEndOdometer());
        holder.startdate.setText(route.getStartDate());
        holder.enddate.setText(route.getEndDate());
    }

    @Override
    public int getItemCount() {
        return routeList.size();
    }

    class routeHolder extends RecyclerView.ViewHolder{

        TextView startlocation,endlocation,startodomeetr,endodometer,startdate,enddate;
        public routeHolder(View itemView) {
            super(itemView);

            startlocation = (TextView) itemView.findViewById(R.id.start_location);
            endlocation = (TextView) itemView.findViewById(R.id.endLocationr);
            startodomeetr = (TextView) itemView.findViewById(R.id.start_odometer);
            endodometer = (TextView) itemView.findViewById(R.id.last_odometer);
            startdate = (TextView) itemView.findViewById(R.id.start_date);
            enddate = (TextView) itemView.findViewById(R.id.end_date);
        }
    }
}
