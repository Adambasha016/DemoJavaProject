package org.Itpl.Diatoz;

import java.util.Arrays;

public class RemovingDuplicateFromSortedArray {
public static void main(String[] args) {
	int []arr= {2,2,2,2,2};
	int []ar2= {1,2,2,3,4,4,4,5,5,6};
	int f = removieDuplicate(arr, arr.length);
	int g = removieDuplicate(ar2, ar2.length);
//	System.out.println(Arrays.toString(arr));
	//System.out.println(Arrays.toString(ar2));
	for(int i=0;i<f;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	for(int i=0;i<g;i++) {
		System.out.print(ar2[i]);
	}
	
}
public static int removieDuplicate(int []a,int n) {
	if(n==0||n==1) return n;
		int []temp=new int[n];
		int j=0;
		for(int i=0;i<a.length-1;i++)
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i]; 
				}
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
	}
		
		return j;
}
}
