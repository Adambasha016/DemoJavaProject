package org.Itpl.Diatoz;

import java.util.Scanner;

public class MaximumOccurenceInAString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a String");
	String a = sc.next();
	occurence(a);
}

public static void occurence(String s) {
	int max=0;
	String s1="";
	while(s.length()>0) {
		char c = s.charAt(0);
		String replace = s.replace(c+"", "");
		int lenth=s.length()-replace.length();
		if(max<lenth) {
			max=lenth;
			s1=c+"";
		}
		s=replace;
	}
	System.out.println(s1+" repeted "+max+" times");
}


}
