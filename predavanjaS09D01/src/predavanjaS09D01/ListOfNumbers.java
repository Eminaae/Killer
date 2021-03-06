package predavanjaS09D01;

import java.util.Scanner;

public class ListOfNumbers {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		Node head = null;
		Node last = null;
		
		System.out.println("Unesite proizvoljan broj pozitivnih brojeva: ");
		
		while (true) {
			int n = s.nextInt();
			if (n > 0){
				Node newNode = new Node(n);
				
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
		
		int length = 0;
		int sum = 0;
		Node currentNode = head;
		
		while (currentNode != null) {
			sum += currentNode.getValue();
			length += 1;
			currentNode = currentNode.getNext();
		}
		System.out.printf("Unlijeli ste %d pozitivnih brojeva\n", length);
		System.out.println("Suma unesenih brojeva je: " + sum);
		s.close();
	}

}
