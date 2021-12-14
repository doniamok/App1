package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_record extends AppCompatActivity {
    Button decrease_weight ;
    Button increase_weight ;
    Button decrease_length ;
    Button increase_length;
    Button save ;
    EditText weight ;
    EditText length ;
    int count_1 ;
    int count_2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        ActionBar actionBar=getSupportActionBar() ;
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_add_record);

        save=findViewById(R.id.save) ;
        increase_weight=findViewById(R.id.increase_weight) ;
        increase_length=findViewById(R.id.increase_length) ;
        decrease_length=findViewById(R.id.decrease_length) ;
        decrease_weight=findViewById(R.id.decrease_weight) ;
        weight=findViewById(R.id.edit_weight);
        length=findViewById(R.id.edit_length) ;


        increase_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_1=count_1+1;
                weight.setText(String.valueOf(count_1));

            }
        });


        increase_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_2=count_2+1;
                length.setText(String.valueOf(count_2));
            }
        });

        decrease_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_1=count_1-1;
                weight.setText(String.valueOf(count_1));

            }
        });

        decrease_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_2=count_2-1;
                length.setText(String.valueOf(count_2));
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