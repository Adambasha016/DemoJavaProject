package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
//		int []as= {5,3,4,1,2};
		int []as= {0,1,0,0,1,1,0,1,0,0,1,0};
		insertionSort(as);
		System.out.println(Arrays.toString(as));
	}
public static void insertionSort(int []q) {
	for(int i=0;i<q.length-1;i++) {
		for(int j=i+1;j>0;j--) {
			if(q[j]<q[j-1]) {
				SelectionSort.swap1(q,j,j-1);
			}
			else {
				break;
			}
		}
	}
}
}
