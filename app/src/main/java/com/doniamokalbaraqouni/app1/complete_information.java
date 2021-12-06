package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class complete_information extends AppCompatActivity {
    RadioGroup radioGroup ;
    String gender ;
    Button increase,decrease ;
    Button save_data ;
    EditText weight ;
    EditText length ;

    int intWeight=120;
    int intLength=160;
    String weight2="120";
    String length2="160";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        setContentView(R.layout.activity_copmlete_information);
        radioGroup=findViewById(R.id.radio_group) ;
        save_data=findViewById(R.id.save_data) ;
        increase=findViewById(R.id.increase) ;
        decrease=findViewById(R.id.decrease) ;
        weight=findViewById(R.id.edit_weight);
        length=findViewById(R.id.edit_length) ;

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


        save_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save_data();
            }
        });

    }


    public void save_data() {

        if(gender.equals("0"))
        {
            Toast.makeText(getApplicationContext(),"Select Your Gender First",Toast.LENGTH_SHORT).show();
        }

        else if(intLength==0 || intLength<0)
        {
            Toast.makeText(getApplicationContext(),"Select Your Length First",Toast.LENGTH_SHORT).show();
        }

        else if(intWeight==0|| intWeight<0)
        {
            Toast.makeText(getApplicationContext(),"Weight Is Incorrect",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent w = new Intent(complete_information.this, home.class);
            w.putExtra("weight",weight2) ;
            w.putExtra("length",length2) ;
            startActivity(w);

        }


    }



    }



