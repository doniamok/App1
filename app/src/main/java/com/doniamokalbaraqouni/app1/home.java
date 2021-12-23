package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager ;
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
    static home instance ;
    TextView hi_name,logout ;
    EditText status ;
    RecyclerView rv ;
    ArrayList<BMIRecord> records;
     public static BMIRecordAdapter adapter;
    Button add_food_btn ;
    Button add_record_btn;
    Button view_home_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance=this ;
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        setContentView(R.layout.activity_home);
        hi_name=findViewById(R.id.personal_inf) ;
        status=findViewById(R.id.edit_current) ;
        add_food_btn = findViewById(R.id.add_food_btn);
        add_record_btn = findViewById(R.id.add_record_btn);
        view_home_btn = findViewById(R.id.view_home_btn);
        logout=findViewById(R.id.logout) ;


        hi_name.setText("Hi ," + getIntent().getExtras().getString("username"));
        
        add_food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFood();
            }
        });
        add_record_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            addRecord();
            }
            }) ;
        view_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHome() ;
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout() ;
            }
        });

        rv=findViewById(R.id.rv_home) ;
        rv.setLayoutManager(new LinearLayoutManager(this));
        records = new User().getRecords();
        adapter=new BMIRecordAdapter(records,this) ;
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        checkBMIChange() ;

    }

    public void addFood() {
        Intent a = new Intent(home.this, add_food_details.class);
        startActivity(a);
    }

    public void addRecord() {
        Intent t = new Intent(home.this, add_record.class);
        startActivity(t);
    }

    public void viewHome(){
        Intent w = new Intent(home.this,food_list.class) ;
        startActivity(w);
    }

    public void logout(){
      Intent d=new Intent(home.this,login.class)  ;
    }

    public static void checkBMIChange(){
        if(instance==null)return;
        instance.adapter.notifyDataSetChanged();
        instance.status.setText(User.user.getHomeMessage()) ;
        instance.hi_name.setText("Hi,"+User.user.getName()) ;
    }
    @Override
    protected void onResume(){
        super.onResume();
        checkBMIChange();
    }
}