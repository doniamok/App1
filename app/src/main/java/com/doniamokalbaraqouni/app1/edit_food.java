package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class edit_food extends AppCompatActivity {
    TextView name;
    TextView category;
    TextView calory;
    Button upload;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_style);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_edit_food);
        name = findViewById(R.id.name_food2);
        category = findViewById(R.id.category2);
        calory = findViewById(R.id.calary2);
        upload = findViewById(R.id.upload2);
        save = findViewById(R.id.save_btn2);
    }
}