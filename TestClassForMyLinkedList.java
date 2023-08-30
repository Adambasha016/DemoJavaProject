package org.practice.DSA.FAANG.recursion;

public class TestClassForMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList1 list=new MyLinkedList1();
		list.insertAtFirst(30);
		list.insertAtFirst(40);
		list.insertAtFirst(50);
		list.insertAtFirst(60);
		list.insertAtFirst(70);
		list.insertAtFirst(80);
		list.insertAtFirst(20);
		list.insertAtFirst(10);
		list.insertAtFirst(90);


		//	list.display();
		System.out.println();
		System.out.println("size of likedlist is -->"+list.size() );
		list.addAtSpiciedIndex(5, 1);
		list.addAtSpiciedIndex(2, 0);
		//	list.display();
		System.out.println("size of likedlist is -->"+list.size() );
		list.addAtSpiciedIndex(33, 11);
		list.display();
		list.add(34);
		list.add(35);
		list.add(36);
		//	System.out.println();
		list.display();
		System.out.println("size of likedlist is -->"+list.size() );
		list.insertAtEnd(37);
		list.insertAtEnd(38);
		list.display();
		System.out.println(list.deletFistNode());
		list.display();
		System.out.println(list.deletlastNode());
		list.display();
		System.out.println("size of likedlist is -->"+list.size() );
		System.out.println( list.deletlastNode()+"       "+list.deletFistNode()) ;
		list.display();
		System.out.println(list.deletAtSpiciedIndex(3));
//		System.out.println(list.deletAtSpiciedIndex(2));
		list.display();
		System.out.println(list.find(10));
		//         list.deletLinkedList();	
		//System.out.println("after reversing the linked list ");
		System.out.println("middle element of list is --> "+list.findMiddleElement());
//		list.reversLinkedList();
//		System.out.println("middle element of list after reversing  is --> "+list.findMiddleElement());
		System.out.println("Kth elemet from last of the linked list--->"+list.findKthNodeFromLast(14));
		list.display();


	}
}
