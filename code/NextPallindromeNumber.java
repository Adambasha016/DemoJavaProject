package org.basic.prg.code.repet.code;

import java.util.Scanner;

public class NextPallindromeNumber {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter a number");
	int s = a.nextInt();
	 boolean chek = isPallindrome(s);
          while(chek==true) {
        	  s++;
        	  if(isPallindrome(s)==true) {
        		  System.out.println(s+"  ");
        		  break;
        	  }
          }
       
}
	
	public static boolean isPallindrome(int num) {
		int rev=0;
		int temp=num;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		return num==rev;
	}
}
