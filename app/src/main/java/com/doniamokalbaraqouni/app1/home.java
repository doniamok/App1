package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
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
    RecyclerView rv ;
    ArrayList<BMIRecord> records;
    BMIRecordAdapter adapter;
    Button add_food_btn ;
    Button save_btn1;
    Button view_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style);
        setContentView(R.layout.activity_home);

        tv = findViewById(R.id.personal_inf);
        tv.setText("Hi ," + getIntent().getExtras().getString("username"));

        add_food_btn = findViewById(R.id.add_food_btn);
        save_btn1 = findViewById(R.id.save_btn1);
        view_home = findViewById(R.id.view_home);
        add_food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });
        save_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            save_btn1();
            }
            }) ;

        rv=findViewById(R.id.rv_home) ;
        rv.setLayoutManager(new LinearLayoutManager(this));
        records = (new User()).getRecords();
        adapter=new BMIRecordAdapter(records,this) ;
        rv.setAdapter(adapter);



    }

    public void add() {
        Intent a = new Intent(home.this, add_record.class);
        startActivity(a);
    }

    public void save_btn1() {
        Intent t = new Intent(home.this, add_food_details.class);
        startActivity(t);
    }
}