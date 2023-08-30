package org.basic.prg.code.repet.code.repet;

public class ReveseAString {
	
	public static void main(String[] args) {
		String s="abcd";
		System.out.println(reverse(s, "", s.length()-1));
	}
	
	
	
static String reverse(String a,String s,int i) {
	if(i<0) {
		return s;
	}
	return reverse(a,s+a.charAt(i), i-1);
}
}
