package org.basic.prg.code.repet.code.repet;

import java.util.Arrays;

public class BinarySearch {

	
	public static int binary(int []a,int key) {
		int l=0,h=a.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int []a= {2,5,6,7,9,3,20,24,22};
		Arrays.sort(a);
		int key=20;
		System.err.println(binary(a, key));
	}
	
	
	
}
