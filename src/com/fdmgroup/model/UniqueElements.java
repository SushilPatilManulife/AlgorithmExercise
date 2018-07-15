package com.fdmgroup.model;

import java.util.Scanner;

public class UniqueElements {
	private static Scanner sc;
	private static int[] a = null;
	private static int[] b = null;
	private static int arrayLength = 0;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter length of Array:");
		arrayLength = sc.nextInt();
		a = new int[arrayLength];
		b = new int[arrayLength];
		System.out.println("Enter Array 1:");
		for (int j = 0; j < arrayLength; j++) a[j] = sc.nextInt();
		System.out.println("Enter Array 2:");
		for (int k = 0; k < arrayLength; k++) b[k] = sc.nextInt();
		System.out.println("Elements unique to first array: ");
		for (int r : a)
			for (int v : b)
				if (r == v)	System.out.println(r);
	}
}