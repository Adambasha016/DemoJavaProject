package org.basic.prg.code.repet.code.repet;

import java.util.ArrayList;

public class SubSequence {
static ArrayList<String> al=new ArrayList<>();
	
	static void gas(String s,String a) {
		
		if(s.length()==0) {//s.equals("")
			al.add(a);
			return;
		}
		gas(s.substring(1),a+s.charAt(0));
		gas(s.substring(1),a);
	}
	
	
	public static void main(String[] args) {
		gas("abc","");
		System.out.println(al);
	}
}
