package org.basic.prg.code.repet.code.repet;

public class NumberOfSetBits {
	public static void main(String[] args) {
	countsetBits(10);	
	}	
public static void countsetBits(int n) {
	int count=0;
	while(n>0) {
		n=n&(n-1);
		count++;
	}
	System.out.println(count);
}
}







  