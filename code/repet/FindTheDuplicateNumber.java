package org.basic.prg.code.repet.code.repet;

public class FindTheDuplicateNumber {
public static void main(String[] args) {
	int []as= {1,3,4,2,3};
	int count=1;
	for(int i=0;i<as.length-1;i++) {
		if(as[i]==as[i+1]) {
			count++;
		}
	
		 if(count>1) {
				System.out.println("["+as[i]+"]");
				System.err.println(count);
			}	

	}
}
}
