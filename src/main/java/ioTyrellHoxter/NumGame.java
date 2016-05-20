package ioTyrellHoxter;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by tyrellhoxter on 4/29/16.
 */
public class NumGame {
   Player player = new Player();
    private int tries;
   private int lastGuess;
   private int guess;
    private int secret;
    public boolean gameOver = false;
    public void setSecret() {
        Random RandomNum = new Random();
        secret = RandomNum.nextInt(100);
    }

    public void setGuess(){
        guess = player.getGuess();
    }

    public void setLastGuess(){
        guess = lastGuess;
    }

    public boolean checkConsecutive(){
        if(guess != lastGuess){
            tries++;
            compareGuess();
            setLastGuess();
            return true;
        }else{
            return false;
        }
    }

    public void compareGuess(){
        if(guess == secret){
            System.out.println("Great Job BABY! You figured it out in " + tries + " tries! Great Job");
            gameOver = true;
        }else if(guess < secret){
            System.out.println("Oh No BABY! You gotta Take it Higher " + tries);
        }else{
            System.out.println("Oh No BABY! You Gotta Go LOWER " + tries);
        }
    }

    public void theLoop(){
        while (!gameOver){
            setGuess();
            checkConsecutive();
        }
    }

    public void theRun(){
        NumGame numgame = new NumGame();
        numgame.setSecret();
        numgame.theLoop();
    }
}



