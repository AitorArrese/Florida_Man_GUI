package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Player playerOne = new Player("Aitor1234","1234", "Aitor Arrese-Igor");
        Player playerTwo = new Player("ThisIsHard","QUIT", "Sad Coding");
        Player playerThree = new Player("YUR","4321", "Please Work");

        new FloridaManStory("Florida man charged with assault with a deadly weapon after throwing Alligator through Wendy's window","Alligator","Crocodile","Gun","Knife");
        new FloridaManStory("Florida man caught liking doorbells","doorbells","strangers","cars","iphones");
        new FloridaManStory("Florida man accused of threatening grocery store employees with Ax after being told to wear a mask","Ax","Chair","Blender","Knife");
        new FloridaManStory("Florida woman selling chicken nugget shaped like manatee for $5,000","5,000","50","2,000","200");
        new FloridaManStory("Florida man dressed as Grim Reaper goes to beach tour to scare off visitors","Grim Reaper","Shark","Whale","Devel");
        new FloridaManStory("Florida women arrested after assaulting boyfriend with Candy Cane during argument","Candy Cane","PlayStation","Xbox","Ruler");
        new FloridaManStory("Video of men playing Uno in middle of Florida traffic goes viral","Uno","SlapJack","Poker","Go Fish");
        new FloridaManStory("Florida influencer filmed herself licking plane Toilet Seat for 'clout' on TikTok as part of 'Coronavirus Challenge'","Toilet Seat","Trash Can","Railing","Suitcase");
        new FloridaManStory("Florida man arrested after stealing 66 rolls of toilet paper from hotel","rolls of toilet paper","light bulbs","shampoo bottles","towels");
        new FloridaManStory("Burglary suspect, 39, dressed only in his underwear strikes Florida officer with Bible while screaming 'I condemn you'","Bible","Rolling Pin","License Plate","Rock");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SendMessage(View view)
    {
        for(Player current: Player.allPlayers.values())
        {
            if(current.getUsername().equals())
        }
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}