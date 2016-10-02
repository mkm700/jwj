package misc;

import static java.lang.System.out; 
import java.util.Scanner;

public class BuildingTreasureChests 
{ 
    public static void main(String[] args) 
    { 
        Scanner keyboard = new Scanner(System.in);
        int boardsPerChest = 9;
        float silverPiecesPerBoard;
        float costForBoards;
        float costPerLock;
        float totalChestCost;
        float investment;
        int numChests;
        float leftOverSilver;
        
        out.println("Pirate Lady Ching wants to build some locking treasure chests.");
        out.println("The chests are a standard size to fit in the ship's cargo area.");
        out.println("Every chest requires 9 boards.");
        out.print("\nWhat is today's price for boards, in silver pieces? ");
        silverPiecesPerBoard = keyboard.nextInt();
        costForBoards = silverPiecesPerBoard * boardsPerChest;
        
        out.println("The cost per chest is " + costForBoards + " silver pieces for boards.");
        
        out.println("\nEach chest also requires lock hardware.");
        out.print("What is today's price for locks, in silver pieces? ");
        costPerLock = keyboard.nextFloat();
        
        out.print("How many silver pieces does Lady Ching wish to invest in building chests? ");
        investment = keyboard.nextFloat();
        
        totalChestCost = costForBoards + costPerLock;
        numChests = (int) investment / (int) totalChestCost;
        leftOverSilver = investment - (numChests * totalChestCost);
        
        out.println("\nThat will pay for the creation of " + numChests + " chests.");
        out.println("Left over silver pieces: " + leftOverSilver);
    } 
}
