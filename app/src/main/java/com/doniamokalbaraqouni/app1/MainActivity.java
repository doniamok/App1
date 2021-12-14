package com.doniamokalbaraqouni.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
   Timer timer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
       getSupportActionBar().setCustomView(R.layout.toolbar_title_style) ;
       ActionBar actionBar= getSupportActionBar() ;
       actionBar.hide();
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,login.class) ;
                startActivity(intent);
                finish();
            }
        },1000);

    }

    public void next(View v){
        Intent x = new Intent(MainActivity.this, login.class) ;
        startActivity(x) ;
    }
}