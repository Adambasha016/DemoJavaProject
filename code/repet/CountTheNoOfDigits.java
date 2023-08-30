package org.basic.prg.code.repet.code.repet;

public class CountTheNoOfDigits {   
	public static void main(String[] args) {
		System.out.println(countDigit(12345));
	}
	
	
  static int countDigit(int a) {
	  if(a==0) {
		  return 0;
	  }
	  return countDigit(a/10)+1;
  }
}
