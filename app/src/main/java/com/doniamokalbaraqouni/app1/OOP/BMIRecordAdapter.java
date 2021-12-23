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
    private Context context;



    public BMIRecordAdapter(ArrayList<BMIRecord> records,Context context){
        this.records=records ;
        this.context=context;
    }

    @NonNull
    @Override
    public  BMIRecordHolder onCreateViewHolder(
            @NonNull ViewGroup parent , int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.element_bmi_record,parent,false) ;
        BMIRecordHolder recordHolder=new BMIRecordHolder(view);
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
