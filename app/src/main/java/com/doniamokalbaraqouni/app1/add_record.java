package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class add_record extends AppCompatActivity {
    Button decrease_weight ;
    Button increase_weight ;
    Button decrease_length ;
    Button increase_length;
    Button save ;
    EditText weight ;
    EditText length ;
    EditText  date2;
    EditText time ;
    int count_1 ;
    int count_2 ;
    int w ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_add_record);

        save = findViewById(R.id.save);
        increase_weight = findViewById(R.id.increase_weight);
        increase_length = findViewById(R.id.increase_length);
        decrease_length = findViewById(R.id.decrease_length);
        decrease_weight = findViewById(R.id.decrease_weight);
        weight = findViewById(R.id.edit_weight);
        length = findViewById(R.id.edit_length);
        date2 = findViewById(R.id.edit_date2);
        time = findViewById(R.id.edit_time);


        increase_weight.setOnClickListener(new View.OnClickListener() {
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


        increase_length.setOnClickListener(new View.OnClickListener() {
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

        decrease_weight.setOnClickListener(new View.OnClickListener() {
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

        decrease_length.setOnClickListener(new View.OnClickListener() {
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


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });


        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(com.doniamokalbaraqouni.app1.add_record.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = day + "/" + month + "/" + year;
                        date2.setText(date);
                    }
                }
                        , year, month, day);
                datePickerDialog.show();
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog=new TimePickerDialog(com.doniamokalbaraqouni.app1.add_record.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                        calendar.set(Calendar.MINUTE, minute);
                        time.setText(hourOfDay + " : " + minute);
                    }
                },12,0,false);

                timePickerDialog.show();
            }
        }) ;
    }
    public void save() {
        Intent q = new Intent(add_record.this, add_food_details.class);
        finish();
        startActivity(q);

    }
}