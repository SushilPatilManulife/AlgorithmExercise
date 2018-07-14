package com.fdmgroup.model;

import java.util.Scanner;  
public class PrimeNumber {
private static    Scanner s;
private static int end=0;
   public static void main(String[] args) {  
       s = new Scanner(System.in);  
       System.out.print("Enter the number : ");  
       end = s.nextInt();  
       System.out.println("List of prime numbers between " + 1 + " and " + end +" excluding last number: ");  
       for (int i = 1; i <= end-1; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n == 1) {  
           return true;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  