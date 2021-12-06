package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_record extends AppCompatActivity {
    Button increase,decrease ;
    Button save ;
    EditText weight ;
    EditText length ;
    int intWeight=80;
    int intLength=160;
    String weight2="80";
    String length2="160";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        ActionBar actionBar=getSupportActionBar() ;
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_add_record);
        save=findViewById(R.id.save) ;
        increase=findViewById(R.id.increase) ;
        decrease=findViewById(R.id.decrease) ;
        weight=findViewById(R.id.edit_weight);
        length=findViewById(R.id.edit_length) ;


     increase.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intWeight=intWeight+1;
            weight2 =String.valueOf(intWeight);
            increase.setText(weight2);
        }
    });


        increase.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intLength=intLength+1;
            length2=String.valueOf(intLength);
            increase.setText(length2);
        }
    });

        decrease.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intLength=intLength-1;
            length2=String.valueOf(intLength);
            decrease.setText(length2);
        }
    });

        decrease.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intWeight=intWeight+1;
            weight2 =String.valueOf(intWeight);
            decrease.setText(weight2);
        }
    });


        save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            save();
        }
    });

  }


    public void save() {
        Intent q = new Intent(add_record.this, add_food_details.class);
        finish();
        startActivity(q);

    }
}