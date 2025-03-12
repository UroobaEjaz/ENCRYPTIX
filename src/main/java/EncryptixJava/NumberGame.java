package EncryptixJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        //playAgain option

        String playAgain = "Yes";

        boolean gameRepetition = false;

        int roundsWon =0;
        int roundsLoss =0;

        do {  //generate the random number
            Random rand = new Random();
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println(randomNumber);
            // ask for the user Input
            System.out.println("Enter the user input: ");
            Scanner userInp = new Scanner(System.in);
            //for generating the turns
            int maxAttempts = 4;
            //store the user Response in an array
            ArrayList<Integer> userInputArray = new ArrayList<>();
            for (int i = 0; i < maxAttempts; i++) {
                int userInput = userInp.nextInt();
                userInputArray.add(userInput);
                //conditions: randomNum<userInput
                if (userInput < randomNumber) {
                    System.out.println("number too low");
                } else if (userInput == randomNumber) {
                    System.out.println("you won the game");
                    roundsWon++;
                    System.out.println("rounds won " + roundsWon);
                    break;
                } else {
                    System.out.println("number too high");
                }
            }
            System.out.println(userInputArray);
            //play again option
            System.out.println("Continue the game: TYPE Yes or to exit TYPE: No ");
            Scanner playAgainOption = new Scanner(System.in);
            String userPlayAgain = playAgainOption.next();
            if (userPlayAgain.equalsIgnoreCase(playAgain)) {
                gameRepetition = true;
            }
            if(roundsWon==0){
                roundsLoss++;
            }
        }while(gameRepetition);

        System.out.println("rounds won : " + roundsWon);
        System.out.println("rounds loss: " + roundsLoss);

    }


}
