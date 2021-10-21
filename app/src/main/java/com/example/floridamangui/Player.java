package com.example.floridamangui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Player implements Serializable {
    public static Player currentPlayer;
    private static Integer ID = 0;
    private Integer primaryID;
    private String username;
    private String password;
    private String fullName;
    private Integer bestScore = 0;
    private Integer currentCorrect = 0;
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

    public static void savePlayer(Context context, Player player) throws IOException
    {
        FileOutputStream fos = context.openFileOutput("player.dat", Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(player);
        os.close();
        fos.close();
        Log.d("Saving", "Saved");
    }
}
