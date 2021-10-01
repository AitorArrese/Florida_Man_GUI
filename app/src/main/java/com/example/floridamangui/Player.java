package com.example.floridamangui;

import java.util.HashMap;

public class Player {
    private static int ID = 0;
    private int primaryID;
    private String username;
    private String password;
    private String fullName;
    private int bestScore = 0;
    public static Player currentPlayer;
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
    public int getBestScore()
    {
        return bestScore;
    }
    public void setBestScore(int score)
    {
        bestScore = score;
    }
}
