package com.doniamokalbaraqouni.app1.OOP;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doniamokalbaraqouni.app1.R;

import java.util.ArrayList;

 public class BMIFoodAdapter extends RecyclerView.Adapter<BMIFoodHolder> {
    private ArrayList<BMIFood> foods ;
    private Context context ;

    public BMIFoodAdapter(ArrayList<BMIFood>Foods,Context context){
        this.foods=foods ;
        this.context=context ;
    }
     @NonNull
     @Override
     public  BMIFoodHolder onCreateViewHolder(
             @NonNull ViewGroup parent , int viewType){
         View view = LayoutInflater.from(context).inflate(R.layout.element_bmi_food,parent,false) ;
         BMIFoodHolder foodHolder=new BMIFoodHolder(view);
         return foodHolder ;
     }

     @Override
     public  void onBindViewHolder(@NonNull BMIFoodHolder holder, int position) {
         BMIFood food = foods.get(position);
         holder.setBMIFood(food);
     }

     @Override
     public int getItemCount(){
         return foods.size() ;

     }
 }


