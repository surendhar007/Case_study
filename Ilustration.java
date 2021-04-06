package com.poc.test;

import java.util.HashSet;

public class Ilustration {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();
		DoubleLinkedList dll = new DoubleLinkedList(null);
		System.out.println("Empty List");
		dll.displayElements();
		dll.insertFirst(1);
		dll.insertFirst(2);
		dll.insertFirst(3);
		dll.insertFirst(7);
		System.out.println("Inserting elements at first");
		dll.displayElements();
		dll.insertLast(80);
		dll.insertLast(4);
		dll.insertLast(50);
		dll.insertLast(6);
		System.out.println("Inserting elements at last");
		dll.displayElements();
		System.out.println("Size of the list " + dll.size());
		Node temp = dll.getHead();
		dll.removeFirst();
		System.out.println("Deleting elements at first");
		dll.displayElements();
		dll.removeLast();
		System.out.println("Deleting elements at last");
		dll.removeLast();
		dll.displayElements();
		System.out.println("deleting using loop");
		dll.displayElements();
		dll.removeLast();
		dll.displayElements();
		dll.insertFirst(887);
		dll.displayElements();
		dll.removeLast();
		dll.displayElements();
		dll.InsertAtIndex(5, 3);
		dll.InsertAtIndex(69, 5);
		dll.InsertAtIndex(69, 6);
		dll.displayElements();
		dll.removeAtIndex(0);
		System.out.println("removing element at 0 position");
		dll.displayElements();
		dll.removeAtIndex(6);
		System.out.println("removing element at 6th position");
		dll.displayElements();
		dll.removeAtIndex(3);
		System.out.println("removing element at 4th pos");
		dll.displayElements();
		dll.removeAtIndex(3);
		dll.removeAtIndex(0);
		dll.displayElements();
		dll.InsertAtIndex(79, 2);
		dll.displayElements();
		dll.InsertAtIndex(36, 1);
		dll.displayElements();
		HashSet<Integer> hash = dll.getLatestData();
		System.out.println(hash);
		int present = dll.Find(3);
		if (present == 1) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}
	}

}
