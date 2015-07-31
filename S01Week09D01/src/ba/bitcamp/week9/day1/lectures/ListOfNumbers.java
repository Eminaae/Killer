package ba.bitcamp.week9.day1.lectures;

import java.util.Scanner;

public class ListOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node head = null; // varijabla da pretstavi trivijalne liste
		Node last = null; // pokazivac na zadnji element liste
		System.out.println("Unsei proizvoljan broj pozitivnih brojeva: ");

		// unos proizvoljnog broja brojeva

		while (true) {
			int n = s.nextInt();
			if (n > 0) {
				Node newNode = new Node(n); // moramo napraviti novi nod
				if (head == null && last == null) {
					head = newNode;
					last = newNode;
				} else {
					last.setNext(newNode);
					last = newNode;
				}
			} else {
				break;
			}
		}

		int length = 0; // racunamo duzinu niza
		int sum = 0;
		Node currentNode = head;

		while (currentNode != null) {
			length += 1;
			currentNode = currentNode.getNext();
			sum += currentNode.getValue();
		}
		System.out.printf("Unijeli ste %d pozitivnih brojeva \n", length);
		System.out.printf("Sum %d = " + sum);
	}
}

