package com.expedia.interview.ex2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Exercise2 {

	static SinglyLinkedListNode head;

	static class SinglyLinkedListNode {

		int data; 
		SinglyLinkedListNode next;

		SinglyLinkedListNode(int d) { 
			data = d; 
			next = null; 
		} 
	}


	boolean hasCycle(SinglyLinkedListNode head) {

		SinglyLinkedListNode node1 = head, node2 = head; 

		while (node1 != null && node2 != null && node2.next != null) { 
			node1 = node1.next; 
			node2 = node2.next.next; 

			// If node1 and node2 meet at same point then loop is present 
			if (node1 == node2) {  
				return true; 
			} 
		} 

		return false;
	}

	// Driver program to test above functions 
	public static void main(String[] args) { 
		Exercise2 list = new Exercise2(); 
		list.head = new SinglyLinkedListNode(50); 
		list.head.next = new SinglyLinkedListNode(20); 
		list.head.next.next = new SinglyLinkedListNode(15); 
		list.head.next.next.next = new SinglyLinkedListNode(4); 
		list.head.next.next.next.next = new SinglyLinkedListNode(10); 

		// Creating a loop for testing  
		head.next.next.next.next.next = head.next.next;

		boolean result=list.hasCycle(head); 
		System.out.println(result);


	} 

}
