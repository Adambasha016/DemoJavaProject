package org.practice.DSA.FAANG.recursion;

public class MyDoubleyLinkedList {

	private	Node head;
	private Node tail;
	private int size;


	public  void add(int ele) {
		Node temp=new Node(ele);
		if(head==null) {
			head=temp;
			tail=temp;
			size++;
			return;
		}
		tail.next=temp;
		temp.prev=tail;
		tail=temp;
		size++;
	}
	
	
	public void addAtFirst(int ele) {
		Node temp=new Node(ele);
		if(head==null) {
			 add(ele);
			return;		
		}
		Node curr=head;
		temp.next=head;
		head.prev=temp;
		head=temp;
		size++;
	}
	
	public void display() {
		Node curr=head;
		if(head==null) {
			System.out.println("list is emty plz try to add ");
		}
		while(curr!=null) {
			if(curr==head) {
				System.out.print("head -->");
			}
			System.out.print(curr.ele+"--->");
			curr=curr.next;
		}
		System.out.println("end");
	}

















	private class Node{
		private int ele;
		private Node next;
		private  Node prev;
		Node(int ele){
			this.ele=ele;
		}
	}

}
