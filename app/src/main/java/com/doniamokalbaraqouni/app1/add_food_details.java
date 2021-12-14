package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class add_food_details extends AppCompatActivity {
    TextView name ;
    TextView category ;
    TextView calory ;
    Button upload ;
    Button save ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        ActionBar actionBar=getSupportActionBar() ;
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_add_food_details);
        name=findViewById(R.id.name_food) ;
        category=findViewById(R.id.category) ;
        calory=findViewById(R.id.calary) ;
        upload=findViewById(R.id.upload) ;
        save=findViewById(R.id.save_btn1) ;

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sava_data2() ;
            }
        });
    }

    public void sava_data2() {
        Intent h = new Intent(add_food_details.this, food_list.class);
        startActivity(h);
    }
    }
