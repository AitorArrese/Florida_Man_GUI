package com.example.floridamangui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
        TextView fullName = (TextView) findViewById(R.id.fullName);
        TextView playerID = (TextView) findViewById(R.id.playerID);
        TextView highScore = (TextView) findViewById(R.id.highScore);
        fullName.setText(Player.currentPlayer.getFullName());
        playerID.setText(String.valueOf(Player.currentPlayer.getPrimaryID()));
        highScore.setText(String.valueOf(Player.currentPlayer.getBestScore()));




    }
}
