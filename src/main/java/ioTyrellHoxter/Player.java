package ioTyrellHoxter;

import java.util.Scanner;

/**
 * Created by tyrellhoxter on 4/29/16.
 */
public class Player {
    public int getGuess() {
        System.out.println("Lets Play A Game.  Choose A Number Between 0-100");
        Scanner guess = new Scanner(System.in);
        return guess.nextInt();
    }
}
