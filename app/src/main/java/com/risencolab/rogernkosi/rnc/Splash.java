package com.risencolab.rogernkosi.rnc;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Splash extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        go();


    }

    public void go(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(SPLASH_TIME_OUT);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(Splash.this, Logon.class);
                    startActivity(i);
                }
            }
        };
        thread.start();
    }
}
