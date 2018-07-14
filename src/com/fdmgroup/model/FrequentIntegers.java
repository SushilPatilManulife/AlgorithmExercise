package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentIntegers {
	private static ArrayList<Integer> list;
	private static Map<Integer, Integer> map;
	private static Map<Integer, Integer> max;
	private static int checkMax=0, input=0, array=0;
	private static Scanner sc;
	public static void main(String[] args) {
		list = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		input = sc.nextInt();
		System.out.println("Now Enter " + input +" values:");
		for(int i=0;i<input;i++){
			array = sc.nextInt();
			list.add(array);
		}
		map = new HashMap<Integer, Integer>();
		for(int temp: list){
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count+1);
		}
		max = new HashMap<Integer, Integer>();
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(entry.getValue()>=checkMax){
				checkMax=entry.getValue();
				max.put(entry.getKey(),entry.getValue());
			}	
		}
		System.out.println("Most Frequent Integer are: ");
		for(Map.Entry<Integer, Integer> t: max.entrySet()){
			System.out.println("Integer:"+t.getKey()+" "
					+ "is repeated "+t.getValue()+" times");
		}
	}
}