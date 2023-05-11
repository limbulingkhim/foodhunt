package com.example.foodhunt;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Menu activity.
 */
public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startGameButton;
    private Button quitGameButton;

    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        startGameButton = findViewById(R.id.startGameButton);
        startGameButton.setOnClickListener(this);

        quitGameButton = findViewById(R.id.quitGameButton);
        quitGameButton.setOnClickListener(this);

        progressBar = findViewById(R.id.progressBar);


    }

    @Override
    public void onClick(View view) {
        if (view == startGameButton) {
            progressBar.setVisibility(View.VISIBLE);
            startGameButton.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), SelectLevelActivity.class));
                    progressBar.setVisibility(View.GONE);
                }
            }, 1000);

        } else if (view == quitGameButton) {
            progressBar.setVisibility(View.VISIBLE);
            quitGameButton.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    finishAffinity();
                    progressBar.setVisibility(View.GONE);
                }
            }, 1000);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        quitGameButton.setVisibility(View.VISIBLE);
        startGameButton.setVisibility(View.VISIBLE);
    }

}