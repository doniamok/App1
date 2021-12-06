package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.doniamokalbaraqouni.app1.OOP.BMIRecord;
import com.doniamokalbaraqouni.app1.OOP.BMIRecordAdapter;
import com.doniamokalbaraqouni.app1.OOP.User;

import java.util.ArrayList;

public class home extends AppCompatActivity {
    TextView tv ;
    TextView cs ;
    RecyclerView rv ;
    ArrayList<BMIRecord> records ;
    float bmi ;
    float intLength,intWeight ;
    String length;
    String weight  ;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style);
        setContentView(R.layout.activity_home);
        cs = findViewById(R.id.edit_current);
        length=getIntent().getStringExtra("length2") ;
        weight=getIntent().getStringExtra("weight2") ;

        intLength=intLength/100 ;
        bmi=intWeight/(intLength*intLength) ;

        if(bmi<18.5){
            cs.setText(R.string.underWeightDetails);
        }
        else if(bmi<=18.5 && bmi<25){
            cs.setText(R.string.Normal) ;
        }
        else if(bmi<=25 && bmi<30){
            cs.setText(R.string.Overweight) ;
        }
        else if(bmi>30){
            cs.setText(R.string.Obesity) ;
        }


        tv = findViewById(R.id.personal_inf);
        tv.setText("Hi ," + getIntent().getExtras().getString("username"));
        rv = findViewById(R.id.rv_home);



        RecyclerView.LayoutManager lm = new GridLayoutManager(getApplicationContext(), 2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);


    }

    public void add(View v) {
        Intent a = new Intent(home.this, add_record.class);
        startActivity(a);
    }

    public void save_btn1(View v) {
        Intent t = new Intent(home.this, add_food_details.class);
        startActivity(t);
    }
}