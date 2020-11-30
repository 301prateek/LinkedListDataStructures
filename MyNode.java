package com.javapractice;

public class MyNode <K> {

	//Defining key of type Generic
	private K key;
	private MyNode next;
	
	//creating a parameterized constructor,
	public MyNode(K key) {
		this.key = null;
		this.next = null;
	}

	//Getter and Setter for MyNode
	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
}
