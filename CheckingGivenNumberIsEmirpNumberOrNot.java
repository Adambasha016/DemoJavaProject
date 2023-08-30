package org.Itpl.Diatoz;

import java.util.Scanner;

public class CheckingGivenNumberIsEmirpNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(isEmirp(num)==true) {
			if(num<9) System.out.println("it`s a prime number but it is single digit number");
			else System.out.println("yes,it`s a emirp number ");
		}
		else 	System.out.println("not a emirp number");

	}
	public static boolean isEmirp(int num) {
		if(isPrime(num)==false) {
			return false;
		}
		int m=0;
		while(num>0) {
			m=m*10+(num%10);
			num/=10;
		}
		return isPrime(m);
	}
	public  static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) return false;
		}
		return true;

	}


}
