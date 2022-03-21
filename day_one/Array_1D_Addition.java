package day_one;

import java.util.Scanner;

public class Array_1D_Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float arr[] = new float[50];
		int size,i;
		float sum = 0;
		System.out.print("Enter the size of array :");
		size = sc.nextInt();
		for(i=0;i<size;i++) {
			arr[i] = sc.nextFloat();
		}
		System.out.println("Input numbers are :");
		for(i=0;i<size;i++) {
			System.out.print(arr[i]+"  ");
			sum += arr[i];
		}
		System.out.println("The sum of array is "+sum);
	}

}
