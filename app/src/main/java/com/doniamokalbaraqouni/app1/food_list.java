package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.doniamokalbaraqouni.app1.OOP.BMIFood;
import com.doniamokalbaraqouni.app1.OOP.BMIFoodAdapter;
import com.doniamokalbaraqouni.app1.OOP.User;

import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager ;

public class food_list extends AppCompatActivity {
    RecyclerView food_list ;
    ArrayList<BMIFood> foods ;
    BMIFoodAdapter foodAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        ActionBar actionBar=getSupportActionBar() ;
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_food_list);
        food_list=findViewById(R.id.food_list) ;

        food_list.setLayoutManager(new LinearLayoutManager(this));
        foods=new User().getFoods() ;
        foodAdapter =new BMIFoodAdapter(foods,this) ;
        food_list.setAdapter(foodAdapter);
    }
}