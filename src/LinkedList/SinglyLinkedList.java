package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	static LinkedList l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		l = new LinkedList();
		l.insertData(85);
		l.insertData(75);
		l.insertData(25);
		l.insertData(35);
		l.insertData(65);
		System.out.println("1. Original List\n2. Reverse List\n3.Middle Element\nEnter Option:\n ");
		option = sc.nextInt();
		if (option == 1) {
			System.out.println("Original:");
			l.display(l.first);
		} else if (option == 2) {
			System.out.println();
			System.out.println("Rverse:");
			l.reverse(l.first);
		} else {
			System.out.println();
			System.out.println("Mid Element:");
			l.displayMidElement(l.first);
		}
	}
}
