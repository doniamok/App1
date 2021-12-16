package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Calendar;


public class complete_information extends AppCompatActivity {
    RadioGroup radioGroup ;
    String gender ;
    Button increase1 ;
    Button decrease1 ;
    Button increase2 ;
    Button decrease2 ;
    Button save_data ;
    EditText weight ;
    EditText length ;
    EditText birth ;
    int count_1=0 ;
    int count_2=0 ;
    int w=0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        setContentView(R.layout.activity_copmlete_information);
        radioGroup=findViewById(R.id.radio_group) ;
        save_data=findViewById(R.id.save_data) ;
        increase1=findViewById(R.id.increase1) ;
        decrease1=findViewById(R.id.decrease1) ;
        increase2=findViewById(R.id.increase2) ;
        decrease2=findViewById(R.id.decrease2) ;
        weight=findViewById(R.id.edit_weight);
        length=findViewById(R.id.edit_length) ;
        birth=findViewById(R.id.edit_date) ;


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.male:
                        gender="male" ;
                        break;
                    case R.id.female:
                        gender="female" ;
                        break;
                }
            }
        });

        increase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    count_1=count_1+1;
                    w=Integer.parseInt(weight.getText().toString());
                    count_2=w+count_1 ;
                    weight.setText(String.valueOf(count_2));
                    count_1=0 ;
                    count_2=0 ;
                    w=0 ;

            }
        });


        increase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_1=count_1+1;
                w=Integer.parseInt(length.getText().toString());
                count_2=w+count_1 ;
                length.setText(String.valueOf(count_2));
                count_1=0 ;
                count_2=0 ;
                w=0 ;
            }
        });

        decrease1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_1=count_1-1;
                w=Integer.parseInt(weight.getText().toString());
                count_2=w+count_1 ;
                weight.setText(String.valueOf(count_2));
                count_1=0 ;
                count_2=0 ;
                w=0 ;

            }
        });

        decrease2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_1=count_1-1;
                w=Integer.parseInt(length.getText().toString());
                count_2=w+count_1 ;
                length.setText(String.valueOf(count_2));
                count_1=0 ;
                count_2=0 ;
                w=0 ;
            }
        });

        Calendar celendar=Calendar.getInstance();
        final int year=celendar.get(Calendar.YEAR);
        final int month=celendar.get(Calendar.MONTH);
        final int day=celendar.get(Calendar.DAY_OF_MONTH);
        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(com.doniamokalbaraqouni.app1.complete_information.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        birth .setText(date) ;
                    }
                }
                ,year,month,day);
                datePickerDialog.show();
            }
        });


        save_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save_data();
            }
        });

    }


    public void save_data() {
            Intent w = new Intent(complete_information.this, home.class);
            startActivity(w);

        }


    }






