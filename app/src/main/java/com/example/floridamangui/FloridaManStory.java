package com.example.floridamangui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FloridaManStory {
    private static int ID = 0;
    private int primaryID;
    private String headline;
    private String keyWord;
    private ArrayList<String> choices;
    HashMap<Integer, FloridaManStory> allQuestions = new HashMap<Integer, FloridaManStory>();
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
}
