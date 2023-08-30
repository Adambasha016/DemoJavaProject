package org.practice.DSA.FAANG.recursion;

import java.nio.channels.ReadPendingException;

public class MyLinkedList1 {

	private Node head;
	private int size;
	private Node tail;
	//***************************************
	private class Node{
		private int val;
		private Node next;
		Node(int val){
			this.val=val;
		}
	}

	//*****************************************









	public void insertAtFirst(int val) {
		Node temp=new Node(val);
		temp.next=head;
		head=temp;
		if(tail==null) {
			tail=temp;
		}
		size++;
	}
	public int size() {
		return size;
	}
	//*********************************************************************8
	public void display() {
		if(head==null) {
			System.out.println("list is emty plz try to add elements to list");
			return;
		}
		Node curr=head;
		while(curr!=null) {
			if(curr==head) {
				System.out.print("head --->");
			}
			System.out.print(curr.val+" --->");
			curr=curr.next;
		}
		System.out.print("END ");
		System.out.println();
	}
	//***********************************************************************


	public void insertAtEnd(int val) {
		Node temp=new Node(val);

		if(head==null) {
			insertAtFirst(val);
			return;
		}
		tail.next=temp;
		tail=temp;
		size++;


	}

	//*****************************************************************
	public void addAtSpiciedIndex(int val,int index) {
		Node temp=new Node(val);
		if(index==0|| head==null) {
			insertAtFirst(val);
			return;
		}
		if(index==size()) {
			insertAtEnd(val);
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
		size++;

	}

	//*********************************************************

	public void add(int val) {
		Node temp=new Node(val);
		if(head==null) {
			head=temp;
			tail=temp;
			size++;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;
		tail=temp;
		size++;
	}
	//**************************************************
	public int deletFistNode() {
		int val=head.val;
		if(head==null) {
			System.out.println("its emty list");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			size--;
		}
		else if(head.next!=null) {
			Node curr=head;
			head=head.next;
			curr.next=null;
			size--;
		}
		return val;
	}
	//*********************************************************
	public int deletlastNode() {
		int val = -1;
		if(head==null) {
			System.out.println("list is emty plz try to add");
		}
		else if(head.next==null) {
			val=head.val;
			head=null;
			tail=null;
			size--;

		}
		else if(head.next!=null) {
			Node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			val=tail.val;
			curr.next=null;
			tail=curr;
			size--;
		}

		return val;
	}
	//**************************************************************
	public int deletAtSpiciedIndex(int index) {
		if(index==0||index==1) {
			return deletFistNode();
		}
		if(index==size) {
			return deletlastNode();
		}
		Node curr=head;
		int count=1;
		while(count<index-1) {
			curr=curr.next;
			count++;
		}
		int val=curr.next.val;
		curr.next=curr.next.next;
		size--;
		return val;
	}
	//*****************************************************
	public int find(int val) {
		Node curr=head;
		int count=1;
		while(curr!=null) {
			if(curr.val==val) {
				return count;
			}
			curr=curr.next;
			count++;
		}
		return -1;
	}
	//**************************************888
	public void deletLinkedList() {
		head=null;
		tail=null;
		size=0;
	}
	//*************************************************8
	public void reversLinkedList() {
		Node prev=null;
		Node curr=head;
		Node next=null;

		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;

		}
		head=prev;


	}
	
	//****************************** 
public int findMiddleElement() {
	Node slow=head;
	Node fast=head;
	while(fast.next!=null&&fast.next.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow.val;
}
//********************************************8
public int findKthNodeFromLast(int k) {
	if(k>size( )) {
		return -1;
	}
	Node slow=head;
	Node first=head;
	int cout=1;
	while(cout<=k) {
		first=first.next;
		cout++;
	}
	while(first!=null) {
		slow=slow.next;
		first=first.next;
		
	}
	return slow.val;
}
}
