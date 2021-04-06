package com.poc.test;

import java.util.HashSet;

public class DoubleLinkedList {
	private Node head;

	public DoubleLinkedList(Node head) {
		super();
		this.head = head;
	}

	public Node getHead() {
		return head;
	}

	public Node insertFirst(int value) {
		Node temp = new Node(value, null, null);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head.previous = temp;
			head = temp;
		}
		return head;
	}

	public Node insertLast(int value) {
		Node temp = new Node(value, null, null);
		Node it = head;
		if (head == null) {
			insertFirst(value);
		} else {
			while (it.next != null) {
				it = it.next;
			}
			it.next = temp;
			temp.previous = it;
		}
		return head;
	}

	public Node InsertAtIndex(int value, int index) {
		Node temp = new Node(value, null, null);
		Node it = head;
		if (index < 0 || index > size()) {
			// when index is not present in the range of list
			System.out.println("Given index is out of the range or invalid");
			return head;
		}
		if (head == null) {
			if (index == 0) {
				insertFirst(value); // when no nodes are there in doubly linked list. and if index is 0 then
									// creating a node and referencing head
			}
		} else if (index == 0) {
			insertFirst(value); // when index is 0 which means inserting node at first. And referencing newly
								// added node as head
		} else if (index == size()) {
			insertLast(value); // when index is same as size which is inserting node at last.
		} else {
			for (int i = 1; i < index; i++) {
				it = it.next; // moving iterator before the position to be inserted
			}
			temp.next = it.next;
			it.next = temp;
			temp.previous = it;
			temp.next.previous = temp;
		}
		return head;
	}

	public Node removeFirst() {
		if (head == null) {
			return head; // Base condition
		} else if (head.next == null) {
			head = head.next; // base condition
		} else {
			head = head.next; // changing head position to next node and dereferencing the old head node
			head.previous = null;
		}
		return head;
	}

	public Node removeLast() {
		if (head == null) {
			return head;
		} else if (head.next == null) {
			removeFirst();
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			Node n = temp.next;
			temp.next = null;
			n.previous = null;
		}
		return head;
	}

	public Node removeAtIndex(int index) {
		if (index < 0 || index > size()) {
			System.out.println("Given Index is out of range or invalid");
			return head;
		}
		if (head == null) {
			return head;
		} else if (index == 0) {
			removeFirst();
		} else if (index == size()) {
			removeLast();
		} else {
			Node it = head;
			for (int i = 1; i < index; i++) {
				it = it.next;
			}
			if (it.next.next == null) {
				it.next = null; // when given index is at last point
				return head; // consider this as base case where index == size -1
			}
			Node temp = it.next;
			it.next = temp.next;
			temp.next.previous = it;
		}
		return head;
	}

	public HashSet<Integer> getLatestData() {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node it = head;
		if (head == null) {
			return hs;
		}
		while (it != null) {
			hs.add(it.data);
			it = it.next;
		}
		return hs;
	}

	public int Find(int value) {
		HashSet<Integer> NodeValues = this.getLatestData();
		if (NodeValues.contains(value)) {
			return 1;
		} else {
			return 0;
		}
	}

	public void displayElements() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " <=> ");
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("null");
		}
		System.out.println(" ");
	}

	public int size() {
		// Temporaliy not using
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

}
