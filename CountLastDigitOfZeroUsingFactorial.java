package org.practice.marathahalli.generalSocite;

import java.util.Scanner;

public class CountLastDigitOfZeroUsingFactorial {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter a number :");
	int num=scn.nextInt();
	long fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	int count=0;
	long fac=fact;
	while(fact>0){
		int rem=(int) (fact%10);
		if(rem==0) {
			count++;
		}
		else {
			break;
		}
		fact/=10;
	}
	
	System.out.println(count+" "+fac);
}
}
