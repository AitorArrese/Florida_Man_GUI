package com.example.floridamangui;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

public class Player implements Parcelable {
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

    public Player(Parcel in){
        int[] data = new int[1];

        in.readIntArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.bestScore = data[0];
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(new int[] {this.bestScore});
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
