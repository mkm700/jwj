package dotComGame;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComGame {

	public static void main(String[] args) {
		//declare scanner
		Scanner s = new Scanner(System.in);
		//declare int to hold number of guesses
		int numGuesses = 0;
		
		//create the single dotcom object
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		//compute a random number between 0 and 4 that will be the start location cell position
		int loc = (int)(Math.random() * 5);
		ArrayList<String> locations = new ArrayList<String>();
		locations.add(Integer.toString(loc));
		locations.add(Integer.toString(loc+1));
		locations.add(Integer.toString(loc+2));
		
		//setLocationCells using random num + 2 next numbers
		theDotCom.setLocationCells(locations);
		
		//while the dot com is still alive:
		boolean keepPlaying = true;
		while (keepPlaying) {
			//declare a string to hold user guess
			String userGuess;
			
			//get user input from the command line
			System.out.println("Enter a number: ");
			userGuess = s.nextLine();
			
			//checkYourself
			String result = theDotCom.checkYourself(userGuess);
			numGuesses++;
			if (result == "kill") {
				keepPlaying = false;
				//print number of guesses
				System.out.println("You took " + numGuesses + " guesses");
			}
		}	
	}

}
