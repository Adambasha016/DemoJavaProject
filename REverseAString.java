package org.practice.DSA.FAANG.recursion;

import java.util.Arrays;

public class REverseAString {
 
	public static void main(String[] args) {
		String s1="Welcome to   India";
		String reverse = reverse(s1);
		System.out.println(reverse);     //adnI t mocleW
	}
	public static  String reverse(String as) {
		String a="";
		for(int i=0;i<as.length();i++) {
			if(as.charAt(i)!=' '&&check(as.charAt(i), a))  //   to check duplicate charecters 
			{
				a=as.charAt(i)+a;
			}
			else if(as.charAt(i)==' '&&as.charAt(i+1)!=' ') {
				a=" "+a; 
			}	
		}
		return a;
		//		System.out.println(a);
	}
	public static void checkDuplicate(String as) {
		String[] split = as.split(" ");
		String qa="" ;
		for(int i=0;i<split.length;i++) {
			char[] az=split[i].toLowerCase().toCharArray();
			for(int j=0;j<az.length;j++) {
				for(int k=j+1;k<az.length;k++) {
					if(az[j]==az[k]) {

						az[j]=' ';
					}

				}

				qa=qa+az[j];
			}
		}
		System.out.println(Arrays.toString(split)+" fe     "+qa);


	}

	public static boolean check(char a,String z) {
		z = z.toLowerCase();
//		System.out.println( );
		if(z.length()==0) {
			return true;
		}
		for(int i=0;i<z.length();i++) {
			if(z.charAt(i)==a) {
				return false;
			}
		}
		return true;
	}

}


