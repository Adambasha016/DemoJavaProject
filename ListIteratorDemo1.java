package org.Itpl.Diatoz;

import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorDemo1 {
public static void main(String[] args) {
	ArrayList list =  new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    list.add(70);
    System.out.println(list);
    ListIterator itr = list.listIterator();    
    System.out.println(" moving forword");
    while(itr.hasNext()) {
    	System.out.print(itr.next()+" ");
    System.out.println(itr.nextIndex());
    }
    System.out.println();
    System.out.println("\"movinng back\"");
    while(itr.hasPrevious()) {
    	System.out.print(itr.previous()+" ");
    	System.out.println(itr.previousIndex());
    }
    }
}
