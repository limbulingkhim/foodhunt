package com.example.foodhunt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Select level activity.
 */
public class SelectLevelActivity extends AppCompatActivity implements View.OnClickListener {

    private Button easyButton;
    private Button mediumButton;
    private Button hardButton;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);

        easyButton = findViewById(R.id.easyButton);
        easyButton.setOnClickListener(this);

        mediumButton = findViewById(R.id.mediumButton);
        mediumButton.setOnClickListener(this);

        hardButton = findViewById(R.id.hardButton);
        hardButton.setOnClickListener(this);

        progressBar = findViewById(R.id.progressBar);
    }

    @Override
    public void onClick(View view) {
        progressBar.setVisibility(View.VISIBLE);
        if (view == easyButton) {
            easyButton.setVisibility(View.INVISIBLE);
            new GameLevelsSpeeds(16, 20, 25, "Easy");
        } else if (view == mediumButton) {
            mediumButton.setVisibility(View.INVISIBLE);
            new GameLevelsSpeeds(24, 28, 33, "Medium");

        } else if (view == hardButton) {
            hardButton.setVisibility(View.INVISIBLE);
            new GameLevelsSpeeds(32, 36, 41, "Hard");

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                progressBar.setVisibility(View.INVISIBLE);
            }
        }, 1000);

    }

    @Override
    protected void onResume() {
        super.onResume();
        easyButton.setVisibility(View.VISIBLE);
        mediumButton.setVisibility(View.VISIBLE);
        hardButton.setVisibility(View.VISIBLE);
    }
}