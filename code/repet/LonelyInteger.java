package org.basic.prg.code.repet.code.repet;

import java.util.HashSet;

public class LonelyInteger {
public static void main(String[] args) {
	int ar[]= {1,2,3,4,3,2,1};
	System.out.println(lonelyinteger(ar))  ;
}
public static int lonelyinteger(int ar[]) {
	

HashSet<Integer> s=new HashSet<>();
  for(int i:ar) {
	  if(s.contains(i)) {
		  s.remove(i);
	  }
	  else {
		  s.add(i);
	  }
  }
  for(int i:s) {
	  return i;
  }
  return -1;



}
}
