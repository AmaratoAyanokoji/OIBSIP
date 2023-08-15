package com.main.stopwatch;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(3500);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent =new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}
