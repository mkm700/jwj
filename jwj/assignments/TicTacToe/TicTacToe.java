package TicTacToe;

import static java.lang.System.out; 
import java.util.Scanner;

public class TicTacToe 
{ 
    public static void clear() {
        out.print('\u000C');
    }
    
    //Welcome text
    public static void printWelcomeText() {
        out.println("Welcome to Tic Tac Toe!\n");
        out.println("To play, enter a number for which box to play in:");
        out.println("1 2 3");
        out.println("4 5 6");
        out.println("7 8 9");
        out.println("\nYou'll need a buddy to play with. Let's begin.\n\n");
    }
    
    //reset the board with '.' in every square
    public static void resetBoard(char board[][]) {
        for (int r = 0; r<3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = '.';
            }
        }
    }
    
    //Display the board
    public static void displayBoard(char board[][]) {
        for (int r = 0; r<3; r++) {
            for (int c = 0; c < 3; c++) {
                out.print(board[r][c]);
                if (c < 2) {
                    out.print(" | ");
                }
            }
            out.println();
        }
        out.println();
    }
    
    //Ask user for move and validate - return the move
    public static int getMove(char xoTurn, char[][] board) {
        boolean isValid = false;
        int move = 0;
        do {
            out.print("Your move, " + xoTurn + ": ");
            move = keyboard.nextInt();
                //check for number between 1 and 9
                if (move >= 1 && move <= 9) {
                    isValid = true;
                    //check for occupied space
                    isValid = spaceOpen(move, board);
                    if (!isValid) {
                        out.println("That space is already occupied. Try again.");
                    }
                }
                else {
                    out.println("Number must be between 1 and 9. Try again.");
                }
        } while (!isValid);
        return move;
    }
    
    //Check for open space
    public static boolean spaceOpen(int move, char[][] board) {
        int r = 0;
        int c = 0;
        
        //set row
        if (move == 4 || move == 5 || move == 6) {
            r = 1;
        }
        else if (move == 7 || move == 8 || move == 9) {
            r = 2;
        }
        
        //set column
        if (move == 2 || move == 5 || move == 8) {
            c = 1;
        }
        else if (move == 3 || move == 6 || move == 9) {
            c = 2;
        }
        
        //Check if occupied
        if (board[r][c] == '.') {
            return true;
        }
        else {
            return false;
        }
        
    }

    //Determine which square to place X or O and display the new board
    public static void placeMove(int move, char xo, char[][] board) {
        if (move == 1) {
            board[0][0] = xo;
        }
        else if (move == 2) {
            board[0][1] = xo;
        }
        else if (move == 3) {
            board[0][2] = xo;
        }
        else if (move == 4) {
            board[1][0] = xo;
        }
        else if (move == 5) {
            board[1][1] = xo;
        }
        else if (move == 6) {
            board[1][2] = xo;
        }
        else if (move == 7) {
            board[2][0] = xo;
        }
        else if (move == 8) {
            board[2][1] = xo;
        }
        else {
            board[2][2] = xo;
        }
        //clear();
        displayBoard(board);
    }
    
    //switch X and O for next turn
    public static char changeXO(char xo) {
        if (xo == 'X') {
            return 'O';
        }
        else {
            return 'X';
        }
    }
    
    //did anyone win? is game a tie?  or keep playing?
    public static String checkForWinner(char[][] board) {
        //is there a winner?
        //check for X or O in middle space (eliminate 4: diagnol, vertical, horizontal)
        if ((board[1][1] == 'X')|| (board[1][1] == 'O')) {
            //vertical
            if ((board[1][1] == board[0][1]) && (board[1][1] == board[2][1])) {
                return "win";
            }
            //horizontal
            if ((board[1][1] == board[1][0]) && (board[1][1] == board[1][2])) {
                return "win";
            }
            //diagnol
            if ((board[1][1] == board[0][0]) && (board[1][1] == board[2][2])) {
                return "win";
            }
            //diagnol
            if ((board[1][1] == board[2][0]) && (board[1][1] == board[0][2])) {
                return "win";
            }
        }
        
        //check for X or O in top left corner (eliminate 2: vertical, horizontal)
        if ((board[0][0] == 'X')|| (board[0][0] == 'O')) {
            //horizontal
            if ((board[0][0] == board[0][1]) && (board[0][0] == board[0][2])) {
                return "win";
            }
            //vertical
            if ((board[0][0] == board[1][0]) && (board[0][0] == board[2][0])) {
                return "win";
            }
        }
        
        //check for X or O in bottom right corner (eliminate 2: vertical, horizontal)
        if ((board[2][2] == 'X')|| (board[2][2] == 'O')) {
            //horizontal
            if ((board[2][2] == board[2][1]) && (board[2][2] == board[2][0])) {
                return "win";
            }
            //vertical
            if ((board[2][2] == board[1][2]) && (board[2][2] == board[0][2])) {
                return "win";
            }
        }
        
        //are there spaces left to play??
        for (int r = 0; r<3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '.') {
                    return "play";
                }
            }
        }
        
        //it's a tie
        return "tie";
    } 
    
    //declare globally so scanner keyboard can be used in methods
    static Scanner keyboard = new Scanner(System.in);
    
    //MAIN
    public static void main(String[] args) 
    { 
        //initialize variables
        boolean keepPlaying = true;
        String status = "play";
        int move = 0;
        char xoStart = 'X';
        char xoTurn = 'O';
        int numWinsX = 0;
        int numWinsY = 0;
        int numTies = 0;
        
        //welcome message
        printWelcomeText();
        
        //Create data structure to hold the contents of the board
        char[][] board = new char[3][3];        
        
        //Start loop: keep track of multiple games
        while (keepPlaying) {   
            resetBoard(board);
            out.println(xoStart + " moves first.\n");
            displayBoard(board);
            status = "play";

            //Start loop: go until win, lose, or tie
            while (status.equals("play")) {
                xoTurn = changeXO(xoTurn);
                move = getMove(xoTurn, board);
                placeMove(move, xoTurn, board);
                status = checkForWinner(board);
            }
            
            //Tally the score
            if (status.equals("win")) {
                if (xoTurn == 'X') {
                    numWinsX += 1;
                }
                if (xoTurn == 'O') {
                    numWinsY += 1;
                }
                out.println(xoTurn + " Wins!!!\n");
            }
            else if (status.equals("tie")) {
                numTies += 1;
                out.println("Tie game!!!\n");
            }
            out.println("Score: X = " + numWinsX + ", O = " + numWinsY + "  (Ties: " + numTies + ")\n");
            
            //Play again?
            out.print("Play again (y or n)? ");
            String response = keyboard.next();
            out.println();
            if (( response.equals("y") || response.equals("Y"))){
                xoStart = changeXO(xoStart);
            }
            else {
                keepPlaying = false;
            }
        }   
        out.print("Thanks for playing Tic-Tac-Toe. GOOD-BYE!!!");
    } 
}
