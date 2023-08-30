package org.basic.prg.code.repet.code.repet;

public class CheckPalindrome {
public static void main(String[] args) {
	String a="racecar";
	System.out.println(isPalandrome(a, 0, a.length()-1));
}
static boolean isPalandrome(String s, int i,int j) {
	if(s.charAt(i)!=s.charAt(j)) {
		return false;
	}
	if(j<=i) { return true;}
	return isPalandrome(s, i+1, j-1);
}



}
