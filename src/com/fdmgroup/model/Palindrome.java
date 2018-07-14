package com.fdmgroup.model;

import java.util.Scanner;

public class Palindrome {
	private static String inputString;
	private static Scanner sc;
	private static int length;
	private static Boolean res;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter String or Number : ");
		inputString = sc.nextLine();
		length=inputString.length();
		res = true;
		for(int i=0; i<length;i++){
			if(inputString.substring(length-1, length).equals(inputString.substring(i,i+1))){
				res=true;
				length--;
			}
			else{
				res=false;
				break;
			}
		}
		if(res) System.out.println("Input \""+inputString+"\" is Palindrome"); 
		else System.out.println("Input \""+inputString+"\" is Not Palindrome");
	}
}
