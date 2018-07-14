package com.fdmgroup.model;

public class Triangle {

	public static void main(String[] args) {
		/*
		 * int row=2; for (int i = 1; i <= 5; i++) { for(int j=4; j>=i; j--){
		 * System.out.print("*"); } for(int k=1; k<=(i*2-1);k++){ if(i>=row)
		 * System.out.print(i+"-"); else System.out.print(i); } for(int l=4;
		 * l>=i; l--){ System.out.print("*"); } System.out.println(); } }
		 */
		int r=2, p=4, j=0, i=0, k=0,m=0;
		for (i = 1; i <= 4; i++) {
			
			for(j=3; j>=i; j--){
				System.out.print("-");
			}
			
			for(k=1; k<=i; k++){
				if(i>=r || i == p){
					System.out.print(i);
					System.out.print("-");
				}
				else
					System.out.print(i);
			}
			
			System.out.println();
		}
	}
}
