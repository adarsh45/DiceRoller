package com.example.diceroller;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    private Button rollBtn;
    private ImageButton firstDice, secondDice;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollBtn = findViewById(R.id.rollBtn);
        firstDice = findViewById(R.id.first);
        secondDice = findViewById(R.id.second);
        mp = MediaPlayer.create(this, R.raw.dice_sound_new);

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_1 = random.nextInt(6) + 1;
                rollDice(random_1, firstDice);

                int random_2 = random.nextInt(6) + 1;
                rollDice(random_2, secondDice);

                mp.start();
            }
        });

    }

    public void rollDice(int randomNum, ImageButton imageButton){
        switch (randomNum){
            case 1:
                imageButton.setImageResource(R.drawable.group1);
                break;
            case 2:
                imageButton.setImageResource(R.drawable.group2);
                break;
            case 3:
                imageButton.setImageResource(R.drawable.group3);
                break;
            case 4:
                imageButton.setImageResource(R.drawable.group4);
                break;
            case 5:
                imageButton.setImageResource(R.drawable.group5);
                break;
            case 6:
                imageButton.setImageResource(R.drawable.group6);
                break;
        }
    }

}
