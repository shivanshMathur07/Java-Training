package day_one;

import java.util.Scanner;

public class Arthematic_operations {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		System.out.println("Basic Arthematic operations are :-");
		System.out.println("Sum of "+num1+" and "+num2+" is = "+(num1+num2));
		System.out.println("Difference of "+num1+" and "+num2+" is = "+(num1-num2));
		System.out.println("Product of "+num1+" and "+num2+" is = "+(num1*num2));
		System.out.println("Quotient of "+num1+" and "+num2+" is = "+(num1/num2));
		System.out.println("Remainder of "+num1+" and "+num2+" is = "+(num1%num2));
	}

}
