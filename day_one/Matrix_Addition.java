package day_one;
import java.util.Scanner;

public class Matrix_Addition {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mtx1[][] = new int[10][10];
		int mtx2[][] = new int[10][10];
		int mtx3[][] = new int[10][10];
		int row,col,i,j;
		
		System.out.println("Enter rows :");
		row = sc.nextInt();
		System.out.println("Enter columns :");
		col = sc.nextInt();
		System.out.println("Enter the elements in matrix 1 :-");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				mtx1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix 2 :-");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				mtx2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Sum of both matrices is :-");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				mtx3[i][j] = mtx1[i][j] + mtx2[i][j];
				System.out.print(mtx3[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

}
