package org.prctice.DSA.FAANGM.Quation;
// conclusion   any one if() condition not works then else if() will be execute 
//  all if() are true then else if() woun't work
// any one if()condition is not true then else if() is execute
public class Demooooo {
public static void main(String[] args) {
	String[] as= {"hellos","hel ol","ho how are you"};
	for(int i=0;i<as.length;i++) {
		System.out.println(i);
		if(as[i].indexOf("h")>=0) {
			System.out.println("he he he");
		}
	
		if(as[i].contains(" ")) {
			System.out.println("space");
		}
			
		
		if(as[i].substring(2).contains("h")) {
			System.out.println("he he");
		}
		else if(as[i].length()%2==0) {
			System.out.println("even length");
		}
}
}
}
