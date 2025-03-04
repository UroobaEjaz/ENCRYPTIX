package org.encryptixTask;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

     //Task:1 ----> generating a random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        System.out.println(randomNumber);

        //Task: 2--------> User prompt , limits the number of attempts
            //let's generate the difference randomly (Small difference)
        Random generatedSmallDifference = new Random();
        int smallDiff = generatedSmallDifference.nextInt(2);
        System.out.println("generated small difference is: " + smallDiff);
        //let's generate the difference randomly (Large difference)
        Random generatedLargeDifference = new Random();
        int largeDiff = generatedLargeDifference.nextInt(3)+4;
        System.out.println("generated large difference is: " + largeDiff);



        System.out.println("Please enter a desired number: ");
        Scanner scanner = new Scanner(System.in);

        //storing the user input in an arrays1
        ArrayList<Integer>arrays1 = new ArrayList<>();

        // limit the user to give input only 3 times
        for(int i=1; i<4; i++){
        int  guessedNumber =  scanner.nextInt();
        //condition 1: Winning the game
            if(guessedNumber==randomNumber){
                arrays1.add(guessedNumber);
                System.out.println("you won!");
                break;
            }
        // condition 2: if guessedNumber and randomNumber differs by smallDiff
            else if ((guessedNumber - randomNumber) == smallDiff) {
                System.out.println("Number not too high");
            } else if ((guessedNumber - randomNumber) >= smallDiff) {
                System.out.println("Number not too low");
       //condition 3: if guessedNumber and randomNumber differs by largeDiff
            } else if ((guessedNumber - randomNumber) >= largeDiff) {
                System.out.println("Number too high");
            } else if((guessedNumber - randomNumber) <= largeDiff) {
                System.out.println("Number too low!");
            }
            arrays1.add(guessedNumber);
            System.out.println(guessedNumber);

        }
        System.out.println(arrays1);

        scanner.close();











    }
}
