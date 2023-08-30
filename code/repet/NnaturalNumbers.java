package org.basic.prg.code.repet.code.repet;

public class NnaturalNumbers {

	public static void main(String[] args) {
		printN(5);
	}
	
	public static void printN(int n) {
		if(n==0) {
			return;
		}
		printN(n-1);
		System.out.println(n);
	}
}
