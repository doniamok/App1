package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.doniamokalbaraqouni.app1.OOP.FireBaseConnection;
import com.doniamokalbaraqouni.app1.OOP.User;

public class login extends AppCompatActivity {
    EditText edUsername;
    EditText edPassword;
    Button login;
    TextView sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style);
        setContentView(R.layout.activity_login);
        edUsername = findViewById(R.id.username);
        edPassword = findViewById(R.id.password);
        login = findViewById(R.id.login);
        sign_in = findViewById(R.id.sign_in);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveLogin();
            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign_in();
            }
        });
    }

    public void sign_in() {
        Intent y = new Intent(login.this, registration.class);
        finish();
        startActivity(y);
    }

    public void moveLogin() {

        String uname = edUsername.getText().toString();
        String pass = edPassword.getText().toString();
        if (uname.equals("Mohamed") && pass.equals("12345")) {
            Intent o = new Intent(login.this, home.class);
            o.putExtra("username", edUsername.getText().toString());
            startActivity(o);
        } else {
            Toast.makeText(login.this, "Invalid Usename password pair.", Toast.LENGTH_LONG).show();
        }
    }
}






