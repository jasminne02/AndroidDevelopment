package com.uni.petgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameOverActivity extends AppCompatActivity {

    Button startAgainButton;
    TextView scoreTextView;
    TextView bestScoreTextView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        scoreTextView = findViewById(R.id.scoreTV);
        scoreTextView.setText("Score: " + Score.getCurrentScore());

        bestScoreTextView = findViewById(R.id.bestScoreTV);
        bestScoreTextView.setText("Best score: " + Score.getBestScore());


        startAgainButton = findViewById(R.id.startAgainButton);
        startAgainButton.setOnClickListener(onClick);
    }

    private final View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(GameOverActivity.this, GameActivity.class);
            startActivity(intent);
        }
    };
}
