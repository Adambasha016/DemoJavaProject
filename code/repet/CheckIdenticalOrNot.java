package org.basic.prg.code.repet.code.repet;

import java.util.Arrays;

public class CheckIdenticalOrNot {
public static void main(String[] args) {
	int a[]= {3,4,7,8,9,2,5};
	int a1[]= {3,4,7,8,9,2,5};
//System.out.println(	checkTwoArrays(a, a1));
System.out.println(	checkTwoArrays1(a, a1));
	
}

public static boolean checkTwoArrays1(int []ad,int []as) {
	 return Arrays.equals(ad, as);
}



public static boolean checkTwoArrays(int []ad,int []as) {
	
	Arrays.sort(ad);
	Arrays.sort(as);
	
	if(ad.length!=as.length) {
		return false;
		}
	else {
		for(int i=0;i<ad.length;i++) {
			if(ad[i]!=as[i]) {
				return false;
			}
		}
	}
	return true;
	}
}