package com.example.harshil.expensetracking.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harshil.expensetracking.R;
import com.example.harshil.expensetracking.model.Reminder;

import java.util.ArrayList;
import java.util.List;

public class RecyclerReminderAdapter extends RecyclerView.Adapter<RecyclerReminderAdapter.reminderHolder> {


    List<Reminder> reminderList;
    Reminder reminder;

    public RecyclerReminderAdapter(ArrayList<Reminder> arrayList) {
        this.reminderList=arrayList;
    }

    @NonNull
    @Override
    public reminderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_list_reminder, parent, false);
        return new reminderHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull reminderHolder holder, int position) {

        reminder = reminderList.get(position);
        holder.category.setText(reminder.getCategory());
        holder.date.setText(reminder.getDate());
    }

    @Override
    public int getItemCount() {
        return reminderList.size();
    }

    class reminderHolder extends RecyclerView.ViewHolder{
        TextView date,category;
        ImageView icon;
        public reminderHolder(View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.freminderDate);
            category = (TextView) itemView.findViewById(R.id.reminderCategoty);
            icon = (ImageView) itemView.findViewById(R.id.remindericon);
        }
    }
}
