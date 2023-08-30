package org.practice.marathahalli;

import java.util.Scanner;

public class Demo1992 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int ax = sc.nextInt();
	int sum=0;
	int temp=ax;
	while(ax!=0) {
		int rem=ax%10;
		sum=sum+ rem;
		ax/=10;
	}
	System.out.println(sum);
	if(temp%sum==0) System.out.println("neven number");
	else System.out.println("niot a niven number");
}
}
