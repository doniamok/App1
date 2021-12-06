package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registration extends AppCompatActivity {
    EditText name;
    EditText e_mail ;
    EditText password;
    EditText re_password ;
    Button  create;
    TextView  log_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
        setContentView(R.layout.activity_registration);

        name=findViewById(R.id.name) ;
        e_mail=findViewById(R.id.e_mail) ;
        password=findViewById(R.id.password2) ;
        re_password=findViewById(R.id.re_password) ;
        create=findViewById(R.id.btn_create) ;
        log_in=findViewById(R.id.log_in) ;

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                create();
            }
        });
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log_in() ;
            }
        });
    }

    public void create() {
        Intent z = new Intent(registration.this, complete_information.class);
        finish();
        startActivity(z);

    }

    public void log_in() {
        Intent r = new Intent(registration.this, login.class);
        finish();
        startActivity(r);

    }
}