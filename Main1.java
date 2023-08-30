package org.Itpl.Diatoz;

public class Main1 {
  public static void main(String[] args) {
	int a=5;
	int b=10;
	System.out.println(a+"   "+b);
	swap(5,10);
//	int temp=a;
//	a=b;
//	b=temp;
	System.out.println(a+"  after "+b);
}
  public static void swap(int a,int b) {
	  int temp=a;
	  a=b;
	  b=temp;
	 
  }
}
