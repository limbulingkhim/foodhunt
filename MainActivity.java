package com.example.foodhunt;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    private final static long Interval = 30;
    private final Handler handler = new Handler();
    private FoodHuntView gameView;
     MediaPlayer mySong;

    protected void onPause() {
        super.onPause();
        mySong.release();
        finish();
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            mySong = MediaPlayer.create(MainActivity.this, R.raw.song);
            mySong.start();

            gameView = new FoodHuntView(this);
            setContentView(gameView);

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(() -> gameView.invalidate());
                }

            }, 0, Interval);


        }

    }
