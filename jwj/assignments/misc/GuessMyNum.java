package misc;

import static java.lang.System.out; 
import java.util.Scanner;
import java.util.Random;

public class GuessMyNum 
{ 
    public static int getIntegerBetween(int lower, int upper) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do {
            number = keyboard.nextInt();
            if (number < lower || number > upper) {
                out.println("Oops. That number isn't between " + lower + " and " + upper + ". Try again.");
            }
        }
        while (number < lower || number > upper);
        return number;
    }
    
    public static boolean hiLow(int guess, int randomNum, int count) {
        if (guess > randomNum) {
            out.print("My number is lower.\nGuess again:\n");
            return true;
        }
        else if (guess < randomNum) {
            out.print("My number is higher.\nGuess again:\n");
            return true;
        }
        else {
            out.println("You got it! My number was " + randomNum + ".\nIt took you " + count + " guesses.\n");
            return false;
        }
        
    }
    
    
    public static void main(String[] args) 
    { 
        Scanner keyboard = new Scanner(System.in);
        
        int guess;
        int randomNum;
        int count = 0;
        boolean keepPlaying = true;
        boolean keepGuessing = true;
        String playAgain;
        //Random random = new Random(5);
        int max = 1000;
        
        do {
            //randomNum = random.nextInt(100);
        	randomNum = (int)(Math.random()*max);
            out.println("I'm thinking of a number between 1 and " + max +". What is it?");
            //out.println("Shhh... my number is " + randomNum);
            
            do {
                guess = getIntegerBetween(1, max);
                count++;
                keepGuessing = hiLow(guess, randomNum, count);
            } while (keepGuessing);
            out.println("Would you like to play again (y or n)?");
            playAgain = keyboard.nextLine();
            if (playAgain.equals("n") || playAgain.equals("N") || playAgain.equals("no") || playAgain.equals("No")) {
                keepPlaying = false;
            }
            else {
                count = 0;
            }
        } while (keepPlaying);
        out.print("Good-bye!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    } 
}
