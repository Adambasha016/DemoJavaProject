package org.practice.DSA.FAANG.recursion;

public class CountStpesToReduceANumberToZero {
public static void main(String[] args) {
	System.out.println(count(5, 0));
}


public static int count(int n,int c) {
	if(n==0) {
		return c;
	}
	if(n%2==0) {
		return count(n/2, c+1);
	}
	return count(n-1, c+1);
}
}
