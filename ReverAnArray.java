package org.practice.marathahalli.generalSocite;

import java.util.Arrays;

public class ReverAnArray {
public static void main(String[] args) {
	int []as= {2,3,4,5,6,7,8};
	reverse(as);
	System.out.println(Arrays.toString(as));
}
public static void reverse(int as[]) {
	int st=0;
	int end=as.length-1;
	while(st<end) {
		int temp=as[st];
		as[st]=as[end];
		as[end]=temp;
		st++;
		end--;
	}
}
}
