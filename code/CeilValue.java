package org.basic.prg.code.repet.code;

import javax.sql.rowset.serial.SerialArray;

class Search{
	public static int ceil (int []a,int key) {
		int l=0,h=a.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				return a[mid];
			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}

		}
		if(l<a.length) {
			return a[l];
		}
		else {
			return -1;
		}
	}
	public static int floor(int []a,int key ) {
		int l=0,h=a.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				return a[mid];

			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}

		}
		if(h>=0) {
			return a[h];
		}
		else { return -1;
		}

	}
}
public class CeilValue {
	public static void main(String[] args) {
		int a[]= {19,23,56,61,72,88,92};
//		System.out.println(Search.ceil(a, 105));
		System.out.println((Search.floor(a, 18)));
	}
}
