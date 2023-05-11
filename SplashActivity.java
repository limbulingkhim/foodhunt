package com.example.foodhunt;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Splash activity.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread thread = new Thread() {  //thread for splash screen

            @Override
            public void run() {
                try {
                    sleep(5000); // appear the screen for 5 seconds
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent mainIntent = new Intent(SplashActivity.this, MenuActivity.class); //redirects to next activity
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();
    }
    protected void onPause() {
        super.onPause();
        finish();
    }

    }
