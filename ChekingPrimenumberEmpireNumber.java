package org.Itpl.Diatoz;

import java.util.Scanner;

public class ChekingPrimenumberEmpireNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int int1 = sc.nextInt();
		chekPimeNumber(int1,1);
	}
	public static void chekPimeNumber(int num,int count) {
		if(num<2) {
			System.out.println("not a prime number or emirp number");
		}
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			if(count<2) {
			int number = reverseNumber(num);
			 
			chekPimeNumber(number,count+1);
			}
			else {
				if(num<9) {
					System.out.println("primeNumber becouse its single digit but not a emirp number3");
				}
				else { 
				System.out.println("prime number and emirp  number");
			}}
			//		System.out.println(number);
		}
		else { 
			if(num%2==0&&num!=2) {
				System.out.println("not a prime number");
			}
			else {
			System.out.println(" prime number  but not empire number after a revesing");
			}
		}

	}	
	public static int reverseNumber(int nu) {
		int m=0;
		while(nu>0) {
			int rem=nu%10;
			m=m*10+rem;
			nu/=10;
		}
		return m;
	}
}
