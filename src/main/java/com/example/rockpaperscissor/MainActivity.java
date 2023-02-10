package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    GameHelper rps = GameHelper.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Button startB;
        startB = (Button) findViewById(R.id.startB);

        startB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
        */
    }

    public void startBClick(View v) {
        EditText playerNameET = findViewById(R.id.playerNameET);
        String playerName = playerNameET.getText().toString(); // get string from EditText

        rps.setPlayerName(playerName);

        if(playerName.length() == 0){
            playerNameET.setError("Haan mabalin nga awan karga na atuy.");
        }
        else{
            //open the Game
            Intent intent = new Intent(MainActivity.this, Game.class);
            startActivity(intent);
        }
    }

    public void exitBClick(View view){
        System.exit(0);
    }
}