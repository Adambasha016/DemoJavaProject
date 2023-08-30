package org.practice.DSA.FAANG.recursion;

import java.util.Arrays;

public class MoveZerosToEnd {
public static void main(String[] args) {
//	int []a= {0,1,0,0,1,1,0,1,0};
	int []a= {0,1,0,3,12};
//	int []a= {0,10,22,8,0,5,0};
	move(a);
	System.out.println(Arrays.toString(a));
}
public static void move(int[]num) {
	if(num.length==0||num.length==1)   {
		return;
	}
	int nz=0,z=0;
	for(int i=1;i<=num.length;i++) {
		if(num[nz]!=0) {
			int temp=num[nz];
			num[nz]=num[z];
			num[z]=temp;
			nz++;
			z++;
		}
		else {
			nz++;
		}
	}
	
}
}
