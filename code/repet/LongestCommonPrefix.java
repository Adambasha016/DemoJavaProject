package org.basic.prg.code.repet.code.repet;

import java.util.Arrays;

public class LongestCommonPrefix {
public static void main(String[] args) {
	

	String a[]= {"flower","flow","flight"};
	Arrays.sort(a);
//	for(String s:a) {
//		System.out.println(s);
//	}
	System.out.println(Arrays.toString(a));
	String st=a[0];
	String end=a[a.length-1];
	int id=0;
	while(id<st.length()&&id<end.length()) {
		if(st.charAt(id)==end.charAt(id)) {
			id++;
		}
		else {
			break;
		}
	}
	System.out.println(st.substring(0,id));
	
	
}	
	
	
	
}
