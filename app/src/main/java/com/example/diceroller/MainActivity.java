package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    Button rollBtn;
    ImageButton firstDice, secondDice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollBtn = findViewById(R.id.rollBtn);
        firstDice = findViewById(R.id.first);
        secondDice = findViewById(R.id.second);

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollFirstDice();
                rollSecondDice();
            }
        });

    }

    public void rollFirstDice(){
        int firstDiceNumber = random.nextInt(6) + 1;

        switch (firstDiceNumber){
            case 1:
                firstDice.setImageResource(R.drawable.group1);
                break;
            case 2:
                firstDice.setImageResource(R.drawable.group2);
                break;
            case 3:
                firstDice.setImageResource(R.drawable.group3);
                break;
            case 4:
                firstDice.setImageResource(R.drawable.group4);
                break;
            case 5:
                firstDice.setImageResource(R.drawable.group5);
                break;
            case 6:
                firstDice.setImageResource(R.drawable.group6);
                break;
        }

    }

    public void rollSecondDice(){

        int secondDiceNumber = random.nextInt(6) + 1;

        switch (secondDiceNumber){
            case 1:
                secondDice.setImageResource(R.drawable.group1);
                break;
            case 2:
                secondDice.setImageResource(R.drawable.group2);
                break;
            case 3:
                secondDice.setImageResource(R.drawable.group3);
                break;
            case 4:
                secondDice.setImageResource(R.drawable.group4);
                break;
            case 5:
                secondDice.setImageResource(R.drawable.group5);
                break;
            case 6:
                secondDice.setImageResource(R.drawable.group6);
                break;
        }

    }

}
