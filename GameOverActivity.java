package com.example.foodhunt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Game over activity.
 */
public class GameOverActivity extends AppCompatActivity implements View.OnClickListener {


    private Button startAgainButton;
    private Button backToMenuButton;

    private TextView scoreTextView;




    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("HIGH SCORE: " + getIntent().getIntExtra("SCORE", 0));

        startAgainButton = (Button) findViewById(R.id.startAgainButton);
        startAgainButton.setOnClickListener(this);

        backToMenuButton = (Button) findViewById(R.id.backToMenuButton);
        backToMenuButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if (view == startAgainButton) {
            Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
            startActivity(mainIntent);
        } else if (view == backToMenuButton) {
            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
        }


        finish();
    }
}