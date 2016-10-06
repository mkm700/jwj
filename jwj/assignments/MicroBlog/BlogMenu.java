package MicroBlog;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogMenu {
	//has-a 
	static String activeUser = ""; //TODO: Is this a good way to keep track of current user? 
	private ArrayList<User> users;
	private ArrayList<Post> posts;
	private Scanner s;
	
	//constructor
	BlogMenu() {
		s = new Scanner(System.in);
		users = new ArrayList<User>();
		posts = new ArrayList<Post>();
	}
	
	//getters
	
	//setters
	
	//behaviors
	//display menu
	public int displayMenu() {
		
		System.out.println("Main Menu");
		System.out.println("1) Create a new user");
		System.out.println("2) Become an existing user");
		System.out.println("3) Create a post as the current user");
		System.out.println("4) Print all posts");
		System.out.println("5) Print all users");
		System.out.println("6) Quit");
		
		//if active user, list the username
		if (!activeUser.isEmpty()) {
			System.out.println("You are currently user \"" + activeUser + "\".");
		}
		
		System.out.println("What would you like to do?\nEnter 1 - 5, or 6 to quit: ");
		
		if (s.hasNextInt()) {		
			int option = s.nextInt();	
			while ((option < 1 || option > 6)) {
				System.out.println("Invalid entry. Select a number between 1 and 5 (or 6 to quit). ");
				option = s.nextInt();
			}
			return option;
		}
		else {
			return 6;
		}
	}

	
	//process input
	public void processInput(int x) {
		if (x == 1) {
			addNewUser();
		}
		else if (x == 2) {
			selectUser();
		}
		else if ( x == 3) {
			createNewPost();
		}
		else if ( x == 4) {
			printPosts();
		}
		else if ( x == 5) {
			printUsers();
		}
	}
	
	//1. Add a new user
	public void addNewUser() {
		System.out.print("Enter the username: ");
		String uname = s.next();
		System.out.print("Enter first name: ");
		String fname = s.next();
		System.out.print("Enter last name: ");
		String lname = s.next();
		System.out.print("Enter email: ");
		String email = s.next();
		System.out.print("Enter avatar link: ");
		String photoLink = s.next();
		
		users.add(new User(uname, fname, lname, email, photoLink));
		System.out.println(fname + " " + lname + " has been added.\n");
	}
	
	//2. Become an existing user
		public void selectUser() {
			for (int i=0; i < users.size(); i++) {
				System.out.println((i+1) + ". " + users.get(i));
				System.out.println();
			}
			
			//TODO: need to add validation of number
			//boolean isValid = false;
			
			//while (!isValid) {
				System.out.println("Enter the number of the user you want to become: ");
				int response = s.nextInt() - 1;
				//if (response >= 0 && response  <= users.size() ) {
					//isValid = true;
					//activeUserIdx = response;
					activeUser = users.get(response).getUserName(); 	//save the user name in a static variable
				//}
					
			//}
		}	
	
	//3. Create the post as a current user
		//public Post(String postTitle, String postContents, String uname) {
		public void createNewPost() {
			String uname = activeUser;
			boolean found = false;
			int i = posts.size() - 1;
			if (i >= 0) {								// if there is at least 1 post
				String u = "";
				do {
					u = posts.get(i).getUname();
					
					if (u == uname) {
						found = true;					//display the last post by that user
						System.out.println("Your last post was:\n" + posts.get(i));
					}
					i--;
				} while (i >= 0 && !found);
			}
			
			System.out.println();
			//Ask user for new post info
			System.out.println("Enter the new Post Title: ");
			s.nextLine();
			String postTitle = s.nextLine();
			System.out.println("Enter the new Post Contents: ");
			String postContents = s.nextLine();	
			posts.add(new Post(postTitle, postContents, uname));
			System.out.println("The post has been added.\n");
		}
		
	//4. Print all posts
		public void printPosts() {
			if (posts.size() > 0) {
				System.out.println("POSTS");       
		        for (int i=0; i < posts.size(); i++) {
		        	System.out.println(posts.get(i));
		        }	
			}    
			else {
				System.out.println("There are no posts to print\n");
			}
        }
		
	//5. Print all users
		public void printUsers() {
			if (users.size() > 0) {
				System.out.println("USERS");       
		        for (int i=0; i < users.size(); i++) {
		        	System.out.println(users.get(i));
		        }	
			}
			else {
				System.out.println("There are no users to print\n");
			}
        }
	
	//toString
	
	public static void main(String[] args) {
		int x = 0;
		BlogMenu menu = new BlogMenu();
		do {
			x = menu.displayMenu();
			menu.processInput(x);
		} while (x != 6);
		System.out.println("GOOD-BYE!!");

	}

}
