package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView correctC = (TextView) findViewById(R.id.correctC);
        TextView incorrectC = (TextView) findViewById(R.id.incorrectC);
        TextView correctB = (TextView) findViewById(R.id.CorrectB);
        TextView incorrectB = (TextView) findViewById(R.id.IncorrectB);
        TextView newBest = (TextView) findViewById(R.id.newBestScreen);

        correctC.setText((String.valueOf(Player.currentPlayer.getCurrentScore())));
        incorrectC.setText(String.valueOf(20- Player.currentPlayer.getCurrentScore()));
        correctB.setText(String.valueOf(Player.currentPlayer.getBestScore()));
        incorrectB.setText(String.valueOf(20- Player.currentPlayer.getBestScore()));

    }
}