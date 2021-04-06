package com.poc.test;

public class Node {

	protected int data;
	protected Node previous;
	protected Node next;

	public Node(int data, Node previous, Node next) {
		super();
		this.data = data;
		this.previous = previous;
		this.next = next;
	}

}
