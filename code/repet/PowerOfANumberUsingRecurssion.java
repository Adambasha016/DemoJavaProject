package org.basic.prg.code.repet.code.repet;

public class PowerOfANumberUsingRecurssion {

	
	public static long pow(int x,int y) {
		if(y==0) {
			return 1;
		}
		if(y%2==0) {
			return pow(x,y/2)*pow(x,y/2);
		}
		else {
			return pow(x,y-1)*x;
			
		}
	}
	
	static  long pow1(int x,int y) {
		if(y==0) {
			return 1;
		}
		if(y%2==0) {
			int res=(int) pow1(x,y/2);
			return res*res;	
		}
		else {
			return pow(x,y/2)*x;
		}
	}
	public static void main(String[] args) {
//		System.err.println(pow(5,8));
		System.err.println(pow1(5,8));
	}
	
	
}
