package com.doniamokalbaraqouni.app1.OOP;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doniamokalbaraqouni.app1.R;

public class BMIFoodHolder  extends RecyclerView.ViewHolder {
    private  ImageView img ;
    private final TextView name ;
    private final TextView category ;
    private final TextView calory ;
    private BMIFood food ;

    public BMIFoodHolder(@NonNull View itemView){
        super(itemView) ;
        this.img = itemView.findViewById(R.id.img) ;
        this.name = itemView.findViewById(R.id.name) ;
        this.category = itemView.findViewById(R.id.category) ;
        this.calory = itemView.findViewById(R.id.calary) ;

    }
    public  void  setBMIFood(BMIFood food){
        this.food = food ;
        img.setImageResource(food.getImg());
        name.setText(food.getName()) ;
        category.setText(food.getCategory()) ;
        calory.setText(food.getCalory()+"Cm");

    }
}

