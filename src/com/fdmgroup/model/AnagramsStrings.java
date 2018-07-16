package com.fdmgroup.model;
import java.util.Scanner;
public class AnagramsStrings {
	private static String string1;
	private static String string2;
	private static Scanner sc;
	private static String res1;
	private static String res2;
	private static String strCmp;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		string1 = sc.nextLine();
		System.out.println("Enter String2: ");
		string2 = sc.nextLine();
		AnagramsStrings as= new AnagramsStrings();
		res1=as.checkStrings(string1, string2);
		res2=as.checkStrings(string2, string1);
		if(res1.equals(res2))
			System.out.println("Strings are Anagrams");
		else
			System.out.println("Strings are not Anagrams");
	}

	public String checkStrings(String string1, String string2) {
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) {
				strCmp = string1.substring(i, i + 1);
				if (string2.indexOf(strCmp) < 0)
					return "notfound";
			}
		}
		return "found";
	}
}