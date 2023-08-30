package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int []a= {4,8,1,9,3,5,2};
		sortIn(a);
		System.err.println(Arrays.toString(a));
}
	public static void sortIn(int []d) {
		
		for(int i=1;i<d.length;i++) {
			int key=d[i];
			int j=i-1;
			while(j>-1&&d[j]>key) {
				d[j+1]=d[j];
				j--;
			}
			d[j+1]=key;
		}
		
	}
}
  