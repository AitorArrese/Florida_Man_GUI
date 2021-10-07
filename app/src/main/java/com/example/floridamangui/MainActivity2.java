package com.example.floridamangui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    public int currentCorrect = 0;
    public int currentIncorrect = 0;
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
        setUpQuestion();
    }

    public void setUpQuestion()
    {
        if(FloridaManStory.getCurrentQuestion() > 9)
        {
            Player.currentPlayer.setCurrentScore(currentCorrect);
            Player.currentPlayer.isntNewBest();
            if(Player.currentPlayer.getBestScore() < currentCorrect)
            {
                Player.currentPlayer.isNewBest();
                Player.currentPlayer.setBestScore(currentCorrect);
            }
            Intent changeScreen2 = new Intent(this, Main3Activity.class);
            startActivity(changeScreen2);
        }

        FloridaManStory currentQuestion;
        currentQuestion = FloridaManStory.allQuestions.get(FloridaManStory.getCurrentQuestion());
        TextView headline = (TextView) findViewById(R.id.headline);
        TextView option0 = (TextView) findViewById(R.id.optionA);
        TextView option1 = (TextView) findViewById(R.id.optionB);
        TextView option2 = (TextView) findViewById(R.id.optionC);
        TextView option3 = (TextView) findViewById(R.id.optionD);
        EditText answerBox = (EditText) findViewById(R.id.answerBox);

        headline.setText(currentQuestion.getHeadline());
        option0.setText(currentQuestion.getOption0());
        option1.setText(currentQuestion.getOption1());
        option2.setText(currentQuestion.getOption2());
        option3.setText(currentQuestion.getOption3());
        answerBox.setText("");
    }

    public void checkAnswer(View view)
    {
        FloridaManStory currentQuestion = FloridaManStory.allQuestions.get(FloridaManStory.getCurrentQuestion());
        EditText answerBox = (EditText) findViewById(R.id.answerBox);
        TextView correct = (TextView) findViewById(R.id.correctQ);
        TextView incorrect = (TextView) findViewById(R.id.incorrectQ);

        if(String.valueOf(answerBox.getText()).equals(currentQuestion.getAnswer()))
        {
            currentCorrect += 1;
            correct.setText(String.valueOf(currentCorrect));
        }
        else
        {
            currentIncorrect += 1;
            incorrect.setText(String.valueOf(currentIncorrect));
        }
        FloridaManStory.addCurrentQuestion();
        setUpQuestion();
    }
}
