package com.doniamokalbaraqouni.app1.OOP;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doniamokalbaraqouni.app1.R;

import java.util.ArrayList;

public class BMIRecordAdapter extends RecyclerView.Adapter<BMIRecordHolder> {
    ArrayList<BMIRecord> records;


    public BMIRecordAdapter(ArrayList<BMIRecord> records){
        this.records = records ;

    }

    @NonNull
    @Override
    public  BMIRecordHolder onCreateViewHolder(
            @NonNull ViewGroup parent , int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.element_bmi_record,null,false) ;
        BMIRecordHolder recordHolder=new BMIRecordHolder(v);
        return recordHolder ;
    }

    @Override
    public  void onBindViewHolder(@NonNull BMIRecordHolder holder, int position) {
        BMIRecord record = records.get(position);
        holder.setBMIRecord(record);
    }

    @Override
    public int getItemCount(){
        return records.size() ;

    }
}
