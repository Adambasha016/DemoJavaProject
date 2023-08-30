package org.basic.prg.code.repet.code.repet;

public class PerfectNumber {
public static void main(String[] args) {
	for(int i=1;i<=40;i++) {
		int sum=0;
		int j=1;
	//	System.out.println(i/2+" "+i+" "+j);
		while(j<=i/2) {
			if(i%j==0)sum+=j;
			j++;
			}
		if(i==sum)System.out.println(i);
	}
}
}
