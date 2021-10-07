package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Player playerOne = new Player("Aitor1234","1234", "Aitor Arrese-Igor");
        Player playerTwo = new Player("ThisIsHard","QUIT", "Sad Coding");
        Player playerThree = new Player("YUR","4321", "Please Work");

        new FloridaManStory("Florida man charged with assault with a deadly weapon after throwing ______ through Wendy's window","Alligator","Crocodile","Gun","Knife");
        new FloridaManStory("Florida man caught liking ______","Doorbells","Strangers","Cars","Iphones");
        new FloridaManStory("Florida man accused of threatening grocery store employees with _____ after being told to wear a mask","Ax","Chair","Blender","Knife");
        new FloridaManStory("Florida woman selling chicken nugget shaped like manatee for _______","5,000","50","2,000","200");
        new FloridaManStory("Florida man dressed as _______ goes to beach tour to scare off visitors","Grim Reaper","Shark","Whale","Devel");
        new FloridaManStory("Florida women arrested after assaulting boyfriend with ______ during argument","Candy Cane","PlayStation","Xbox","Ruler");
        new FloridaManStory("Video of men playing ______ in middle of Florida traffic goes viral","Uno","SlapJack","Poker","Go Fish");
        new FloridaManStory("Florida influencer filmed herself licking plane ______ for 'clout' on TikTok as part of 'Coronavirus Challenge'","Toilet Seat","Trash Can","Railing","Suitcase");
        new FloridaManStory("Florida man arrested after stealing 66 _______ from hotel","rolls of toilet paper","light bulbs","shampoo bottles","towels");
        new FloridaManStory("Burglary suspect, 39, dressed only in his underwear strikes Florida officer with _______ while screaming 'I condemn you'","Bible","Rolling Pin","License Plate","Rock");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameBox = (EditText) findViewById(R.id.UsernameBox);

    }

    public void SendMessage(View view)
    {
        Intent changeScreen1 = new Intent(this, MainActivity2.class);
        EditText usernameBox = (EditText) findViewById(R.id.UsernameBox);
        EditText passwordBox = (EditText) findViewById(R.id.PasswordBox);

        for(Player current: Player.allPlayers.values())
        {
            if(current.getUsername().equals(String.valueOf(usernameBox.getText())) && current.getPassword().equals(String.valueOf(passwordBox.getText())))
            {
                Player.currentPlayer = current;
                startActivity(changeScreen1);


            }
        }


    }
}