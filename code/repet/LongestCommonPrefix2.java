package org.basic.prg.code.repet.code.repet;
import java.util.Arrays;
public class LongestCommonPrefix2 {
	public static void main(String[] args) {
		String a[]= {"flow","flower","flight"};
		//	String a[]= {"geeksforgeeks","geeks","geek","geezer"};
		//	String a[]= {"dog","racecar","car"};
		//	String a[]= {"apple","ape ","april"};
		int n=a.length;
		//	System.out.println(n );
		//	Arrays.sort(a);
		String st=a[0];
		for(int j=1;j<n;j++) {
			int s=0;
			while(s<a[j].length()&&(s<st.length()&&st!="")) {
				if(st.charAt(s)==a[j].charAt(s)) {
					s++;
				}
				else {
					break;
				}
			}
			String de="";
			for(int k=0;k<s;k++) {
				de+=st.charAt(k);
			}
			st=de;
		}
		if(st=="") {
			System.out.println("emty String");
		}
		else {
			System.out.println(st);
		}
	}
}













