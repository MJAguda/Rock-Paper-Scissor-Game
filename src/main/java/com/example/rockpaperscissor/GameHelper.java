package com.example.rockpaperscissor;

import android.widget.ImageView;

import java.util.Random;

class GameHelper {

    private static GameHelper instance; //Lazy Singleton
    private GameHelper(){}

    public static GameHelper getInstance(){
        if(instance == null){
            instance = new GameHelper();
        }
        return instance;
    }

    private String playerName;
    private String playerHand;
    private String computerHand;
    private String result;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerHand(String playerHand){
        this.playerHand = playerHand;
    }

    public String getPlayerHand(){
        return playerHand;
    }

    public void setComputerHand() {
        String [] arr = {"rock", "paper", "scissor"};
        Random random = new Random();

        // randomly selects an index from the arr
        int select = random.nextInt(arr.length);

        // prints out the value at the randomly selected index
        this.computerHand = arr[select];
    }

    public String getComputerHand(){
        return computerHand;
    }

    public String getResult(){

        if(playerHand.equals("rock") && computerHand.equals("paper")) {
            this.result = "You Lose!";
        }
        else if(playerHand.equals("rock") && computerHand.equals("scissor")) {
            this.result = "You Win!";
        }
        else if(playerHand.equals("paper") && computerHand.equals("rock")) {
            this.result = "You Win!";
        }
        else if(playerHand.equals("paper") && computerHand.equals("scissor")) {
            this.result = "You Lose!";
        }
        else if(playerHand.equals("scissor") && computerHand.equals("rock")) {
            this.result = "You Lose!";
        }
        else if(playerHand.equals("scissor") && computerHand.equals("paper")) {
            this.result = "You Win!";
        }
        else if(playerHand.equals(computerHand)){
            System.out.println("It's a Tie!");
        }
        else{
            System.out.println("It's a Tie!");
        }

        return result;
    }

}
