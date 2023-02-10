package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {

    GameHelper rps = GameHelper.getInstance();

    private static ImageView playerHandIV;
    private static ImageView computerHandIV;
    private static TextView playerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerHandIV = findViewById(R.id.playerHandIV);
        playerTV = findViewById(R.id.playerTV);

        playerTV.setText(rps.getPlayerName() + "'s Hand");
    }

    private void changeComputerHand() {
        String computerHand = rps.getComputerHand();
        computerHandIV = findViewById(R.id.computerHandIV);

        computerHandIV = findViewById(R.id.computerHandIV);
        if(computerHand.equals("rock")){
            computerHandIV.setImageResource(R.drawable.rock);
        }
        else if(computerHand.equals("paper")){
            computerHandIV.setImageResource(R.drawable.paper);
        }
        else if(computerHand.equals("scissor")){
            computerHandIV.setImageResource(R.drawable.scissor);
        }
    }


    public void rockBClick(View view) {
        rps.setPlayerHand("rock");
        playerHandIV.setImageResource(R.drawable.rock);

        System.out.println("Player Hand is " + rps.getPlayerHand());
        rps.setComputerHand();
        System.out.println("Computer Hand is " + rps.getComputerHand());
        System.out.println("Result : " + rps.getResult());
        Toast.makeText(getApplicationContext(),rps.getResult(),Toast.LENGTH_SHORT).show();
        changeComputerHand();
    }

    public void paperBClick(View view) {
        rps.setPlayerHand("paper");
        playerHandIV.setImageResource(R.drawable.paper);

        System.out.println("Player Hand is " + rps.getPlayerHand());
        rps.setComputerHand();
        System.out.println("Computer Hand is " + rps.getComputerHand());
        System.out.println("Result : " + rps.getResult());
        Toast.makeText(getApplicationContext(),rps.getResult(),Toast.LENGTH_SHORT).show();
        changeComputerHand();
    }

    public void scissorBClick(View view) {
        rps.setPlayerHand("scissor");
        playerHandIV.setImageResource(R.drawable.scissor);

        System.out.println("Player Hand is " + rps.getPlayerHand());
        rps.setComputerHand();
        System.out.println("Computer Hand is " + rps.getComputerHand());
        System.out.println("Result : " + rps.getResult());
        Toast.makeText(getApplicationContext(),rps.getResult(),Toast.LENGTH_SHORT).show();
        changeComputerHand();
    }
}