package day_one;

import java.util.Scanner;

public class Username_check {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String user, password;
		System.out.println("Enter the username :");
		user = sc.nextLine();
		System.out.println("Enter password :");
		password = sc.nextLine();
		if(user.equals("Shiv") && password.equals("Kayy123")) {
			System.out.println("Welcome "+user);
		}
		else {
			System.out.println("Try again");
		}
	}

}
