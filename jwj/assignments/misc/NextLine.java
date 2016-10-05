package misc;

import java.util.Scanner;


public class NextLine {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 word: ");
		String a = s.nextLine();
		System.out.println("Enter an int: ");
		int one = s.nextInt();
		System.out.println("Enter 2 words: ");
		s.nextLine();
		String b = s.nextLine();
		System.out.println("Enter an int: ");
		int two = s.nextInt();
		System.out.println("Enter 3 words: ");
		s.nextLine();
		String c = s.nextLine();
		System.out.println("Enter an int: ");
		int three = s.nextInt();
		System.out.println("Enter 2 words: ");
		s.nextLine();
		String d = s.nextLine();
		System.out.println(a + "\n" + one + "\n" + b  + "\n" + two + "\n" + c + "\n" + three + "\n" + d);


	}

}
