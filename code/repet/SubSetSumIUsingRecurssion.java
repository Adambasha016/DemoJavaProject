package org.basic.prg.code.repet.code.repet;

public class SubSetSumIUsingRecurssion {

	
	
	
	
	public static void main(String[] args) {
		int []ar= {20,10,15,5};
		System.out.println(countSubSet(ar, 25, 0));
	}
	
	 
 
	
	public static int countSubSet(int []ar,int sum,int i) {
		if(sum==0) {
			return 1;
		}
	if(sum<0) {
		return 0;
	}
	if(i==ar.length) {
		return 0;
	}
	return countSubSet(ar, sum-ar[i], i+1)+countSubSet(ar, sum, i+1);
	}
	
	
	
	
	
	
	
	
	
}
