package org.practice.marathahalli;

public class Demo1993 {
	public static void main(String[] args) {
		//naming the loop 

		a:for(int i=1;i<=5;i++) {  
			s:for(int k=1;k<=5;k++) {
				System.out.println(i+" "+k);
				if(i==3) break a    ;
			}
		}
	System.out.println("main ends");
	}
}

