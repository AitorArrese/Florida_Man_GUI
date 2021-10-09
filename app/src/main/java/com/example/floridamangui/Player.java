package com.example.floridamangui;

import java.util.HashMap;

public class Player {
    public static Player currentPlayer;
    private static int ID = 0;
    private int primaryID;
    private String username;
    private String password;
    private String fullName;
    private int bestScore = 0;
    private int currentCorrect = 0;
    public boolean isNewBest;

    public static HashMap<Integer, Player> allPlayers = new HashMap<Integer, Player>();
    public Player(String user, String pass, String name)
    {
        ID += 1;
        primaryID = ID;
        username = user;
        password = pass;
        fullName = name;
        bestScore = 0;
        allPlayers.put(primaryID, this);
    }

    public String getUsername()
    {
        return username;
    }
    public String getFullName()
    {
        return fullName;
    }
    public String getPassword()
    {
        return password;
    }
    public int getPrimaryID()
    {
        return primaryID;
    }
    public int getCurrentScore()
    {
        return currentCorrect;
    }
    public void setCurrentScore(int score)
    {
        currentCorrect = score;
    }
    public int getBestScore()
    {
        return bestScore;
    }
    public void isNewBest(){
        isNewBest = true;
    }
    public void isntNewBest(){
        isNewBest = false;
    }

    public static Player getCurrentPlayer() { return currentPlayer; }

    public void setBestScore(int score)
    {
        bestScore = score;
    }
}
