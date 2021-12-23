package com.doniamokalbaraqouni.app1.OOP;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doniamokalbaraqouni.app1.R;

public class BMIFoodHolder  extends RecyclerView.ViewHolder {
      ImageView img ;
      TextView name ;
      TextView category ;
      TextView calory ;
    /** BMIFood food ;
     View itemView ;**/

    public BMIFoodHolder(@NonNull View itemView){
        super(itemView) ;

        img = itemView.findViewById(R.id.img) ;
        name = itemView.findViewById(R.id.name) ;
        category = itemView.findViewById(R.id.category) ;
        calory = itemView.findViewById(R.id.calary) ;

    }
   /** public  void  setBMIFood(BMIFood food){
        this.food = food ;
        img.setImageResource(food.getImg());
        name.setText(food.getName()) ;
        category.setText(food.getCategory()) ;
        calory.setText(food.getCalory()+"Cal/g");

    }**/
}

