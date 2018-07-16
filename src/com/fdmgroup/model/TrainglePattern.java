package com.fdmgroup.model;

import java.util.Scanner;
/**
 * @author Sushil.Patil
 * program that asks the user to enter an integer value, then prints out following text according to the entered number: 
 *  Assume user entered 4.
 *  - - - 1 - - - 
 *  - - 2 - 2 - -
 *  - 3 - 3 - 3 -
 *  4 - 4 - 4 - 4
 *  
 */
public class TrainglePattern {
	private static int n;
	private static Scanner sc;
	public static void main(String[] args) {
		
		System.out.println("Enter nteger value n:");
		sc = new Scanner(System.in);
		n=sc.nextInt();
		TrainglePattern tr = new TrainglePattern();
		tr.drawTriangle(n);
	}
	/**
	 * This method displays actual shape according to parameter.
	 * @param n number of rows.
	 */
	public void drawTriangle(int n) {
		
		boolean flag=true;
		
		for (int j = 1; j <= n; j++) { // row
			for (int i = n-1; i >= j; i--) {
				System.out.print("-"); // left '-'
			}
			
			//display number if flag is true else display '-'
			for (int k = 1; k <= (2*j-1); k++) { 
				if(flag) {
					System.out.print(j);
					
				}
				else {
					System.out.print("-");
				}
				if(flag) // reset flag after every number
					flag=false;
				else
					flag=true;
			}
			for (int l = n-1; l >= j; l--) { // right '-'
				System.out.print("-");
			}
			if(flag) // reset flag for each new line
				flag=false;
			else
				flag=true;
			System.out.println(""); // new line

		}
	}
}