package com.fdmgroup.model;

import java.util.Scanner;

public class MaximumJump {
	private static int[] input = null;
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Input Array Length:");
		int max=sc.nextInt();
		input = new int[max];
		System.out.println("Input array "+max+" elements:");
		for(int i = 0 ; i < max ; i++)
			input[i] = sc.nextInt();
		int largest = input[0];
		boolean result=false;
		for(int i = 0 ; i < max-1 ; i++){
			if(largest <= i && input[i] == 0)
				result=false;
			if(input[i]+i>largest)
				largest=input[i]+i;
			if(largest>=max-1)
				result=true;
		}
		System.out.println(result);
	}
}
