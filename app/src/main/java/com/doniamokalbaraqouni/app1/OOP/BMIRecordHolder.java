package com.doniamokalbaraqouni.app1.OOP;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doniamokalbaraqouni.app1.R;

public class BMIRecordHolder extends RecyclerView.ViewHolder {
    private final TextView date ;
    private final TextView weight ;
    private final TextView message ;
    private final TextView length ;
    private BMIRecord record ;
    private View itemView ;

    public BMIRecordHolder(@NonNull View itemView){
        super(itemView) ;
        this.itemView = itemView ;
        this.date = itemView.findViewById(R.id.date) ;
        this.weight = itemView.findViewById(R.id.weight) ;
        this.message = itemView.findViewById(R.id.time) ;
        this.length = itemView.findViewById(R.id.length) ;
    }
    public  void  setBMIRecord(BMIRecord record){
        this.record = record ;
        date.setText(record.getDate()) ;
        weight.setText(record.getWeight()+"Kg") ;
        length.setText(record.getLength()+"Cm");
        message.setText(record.getMessage()) ;
    }
}
