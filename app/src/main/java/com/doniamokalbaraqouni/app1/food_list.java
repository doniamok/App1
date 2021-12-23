package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.gesture.GestureOverlayView;
import android.os.Bundle;

import com.doniamokalbaraqouni.app1.OOP.BMIFood;
import com.doniamokalbaraqouni.app1.OOP.BMIFoodAdapter;
import com.doniamokalbaraqouni.app1.OOP.User;

import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager ;

public class food_list extends AppCompatActivity {
    RecyclerView food_list ;
    ArrayList<BMIFood> foods ;
    BMIFoodAdapter adapter_food ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        ActionBar actionBar=getSupportActionBar() ;
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_food_list);
        food_list=findViewById(R.id.food_list) ;
        foods= new ArrayList<BMIFood>() ;
        foods.add(new BMIFood(R.drawable.salamon,"Salamon","Fish",22)) ;
        foods.add(new BMIFood(R.drawable.rais,"Rais","Carbohydrates",30)) ;
        foods.add(new BMIFood(R.drawable.banana,"Banana","Fruit",2)) ;
        foods.add(new BMIFood(R.drawable.apple,"Apple","Fruit",4)) ;
        foods.add(new BMIFood(R.drawable.orange,"Orange","Fruit",2)) ;

        food_list.setLayoutManager(new LinearLayoutManager(this));
        adapter_food =new BMIFoodAdapter(foods,this) ;
        food_list.setAdapter(adapter_food);
    }


}