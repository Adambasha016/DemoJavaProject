package org.basic.prg.code.repet.code.repet;

public class ConjucagtiveOnes {

public static void main(String[] args) {
		countConjugative(110);
	}
	
	
 public static void countConjugative(int num) {
		int count =0;
		while(num>0) {
			num=(num&(num<<1));
			count++;
		}
	System.out.println(count);
	}
	
	
	
	
	
	
}
