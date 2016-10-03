package misc;

import static java.lang.System.out; 
import java.util.Scanner;

public class AddingMachine
{
    public static void main(String[] args) {
        // initialise instance variables
        Scanner keyboard = new Scanner(System.in);
        int tally = 0;
        float total = 0;
        
        out.println("Welcome to Adding Machine!");
        out.println("Total: " + total + "\n");
        out.print("Add: ");
        float addNum = keyboard.nextFloat();
        
        while (addNum != 0) {
            total = total + addNum;
            tally++;
            out.println("Total: " + total + "\n");
            out.print("Add: ");
            addNum = keyboard.nextFloat();
        }
        
        out.println("\nTotal: " + total + "\n");
        out.print("You entered " + tally + " numbers, for a final total of " + total);
        
    }

}

