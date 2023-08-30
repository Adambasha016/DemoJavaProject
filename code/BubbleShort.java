package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class BubbleShort {
	
	
	public static void main(String[] args) {
		int []s= {4,5,7,3,2,1,6};
		sortBu(s);
		System.out.println(Arrays.toString(s));
	}
public static  void sortBu(int []a) {
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
