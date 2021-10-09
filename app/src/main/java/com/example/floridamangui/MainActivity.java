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
        new FloridaManStory("Florida Man flashes buttocks at _______ after impersonating a police officer to get free food","IHOP","McDonalds","Child","Starbucks");
        new FloridaManStory("Florida man claims wife was kidnapped by ________", "Holograms","Neighbors","Giants","Santa Clause");
        new FloridaManStory("Florida Man steals ______ pairs of underwear from Victoria's Secret","850","1,000","60","175");
        new FloridaManStory("Florida Man attacks nephew over __________","Undercooked Noodles","Christmas Present","Star Wars","Video Game");
        new FloridaManStory("Florida Men attack ice cream man who wouldn't take $20 bill for _______","Pickled Sausage","Chocolate Puddling","Strawberry Blast","Milk Shake");
        new FloridaManStory("Florida Man pokes _______ in the eye after she served him waffles instead of pancakes.","Girlfriend","Waiter","Chef","Grandma");
        new FloridaManStory("Florida Man tries to avoid court appearance by claiming he has ______","Ebola","Covid 19","Herpes","Aids");
        new FloridaManStory("Florida Man accidentally butt-dials 911 while _______ with his mom","Cooking Meth","Fighting ","Having Sex","Stealing");
        new FloridaManStory("Florida Man attacks _____ with hatchet after it refuses to take his check","ATM","Macy's","Waiter","Prostitute");
        new FloridaManStory("Florida Man rescued from ______","Vending Machine","Shark","Alligator","Refrigerator");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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