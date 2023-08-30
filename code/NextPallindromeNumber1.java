package org.basic.prg.code.repet.code;

import java.util.Scanner;

public class NextPallindromeNumber1 {
	public static void isKApal(int nu) {
		nu++;
		while(true) {
			int rev=0;
			int temp=nu;
			while(temp>0) {
				int rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			if(rev==nu) {
				System.out.println(rev+" next num");
				break;
			}
			else {
				nu++;
			}
	}
	}
	
	
public static void main(String[] args) {
	Scanner z=new Scanner(System.in);
	System.out.println("Enter a number");
	isKApal(z.nextInt());

//	int num=67;
//	num++;
//	while(true) {
//		int rev=0;
//		int temp=num;
//		while(temp>0) {
//			int rem=temp%10;
//			rev=rev*10+rem;
//			temp/=10;
//		}
//		if(rev==num) {
//			System.out.println(rev+" next num");
//			break;
//		}
//		else {
//			num++;
//		}
//	}
	
	
}
	
	
	
}
