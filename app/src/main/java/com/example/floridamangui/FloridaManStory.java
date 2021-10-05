package com.example.floridamangui;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FloridaManStory {
    private static int ID = 0;
    private int primaryID;
    private String headline;
    private String keyWord;
    private ArrayList<String> choices;
    private static int currentQuestion = 1;
    public static HashMap<Integer, FloridaManStory> allQuestions = new HashMap<Integer, FloridaManStory>();
    public FloridaManStory( String question, String answer, String option1, String option2, String option3)
    {
        ID += 1;
        primaryID = ID;
        headline = question;
        keyWord = answer;
        choices = new ArrayList<String>();
        choices.add(keyWord);
        choices.add(option1);
        choices.add(option2);
        choices.add(option3);
        Collections.shuffle(choices);
        allQuestions.put(primaryID, this);
    }

    public String getHeadline() {
        return headline;
    }
    public String getOption0() {
        return choices.get(0);
    }
    public String getOption1() {
        return choices.get(1);
    }
    public String getOption2() {
        return choices.get(2);
    }
    public String getOption3() {
        return choices.get(3);
    }
    public String getAnswer() {
        return keyWord;
    }
    public static int getCurrentQuestion() {
        return currentQuestion;
    }
    public static void addCurrentQuestion() {
        currentQuestion ++;
    }

}


