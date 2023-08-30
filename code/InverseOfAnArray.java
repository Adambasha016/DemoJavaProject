package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class InverseOfAnArray {

	public static void main(String[] args) {
		int x[]= {6 ,5,4,0,1,2,3};
		int[] anArray = inverseOfAnArray(x);
		System.out.println(Arrays.toString(anArray))  ;
	}
	public static int[] inverseOfAnArray(int []a) {
		int []as=new int [a.length];
		for(int i=0;i<a.length;i++) {
			int v=a[i];
			as[v]=i;
		}
		return as;
	}
}
