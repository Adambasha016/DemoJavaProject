package org.basic.prg.code.repet.code;

public class FIndTheFequenceOfElementInSotredArray {
      
	public static void main(String[] args) {
//		int aq[]= {20,20,30,30,30,40,40,50,60,70,100,190};
		int aq[]= {20,40,40,40,40};
		int s[]= {20,30,30,40,40,50,50};
		frequence(aq);
//		freq1(s); ...
	}
	 public static void freq1(int []a) {
		 int count=1;
		 for(int i=1;i<a.length;i++) {
			 if(a[i]==a[i-1]) {
				 count++;
			 }
			 else {
				 System.out.println(a[i-1]+" "+ count);
				 count=1;
			 }
			 
		 }
//		 System.out.println(count);
	 }
	
	
	
	public static void frequence(int []as) {
	int freq=1;
	int i=1;
	while(i<as.length) {
		while(i<as.length&&as[i]==as[i-1]) {
			freq++;
			i++;
		}
		System.out.println(as[i-1]+" "+freq);
		freq=1;
		i++;
	}
	if(as.length==1||as[i-1]!=as[i-2]) {
		System.out.println(as[i-1]+" "+freq);
	}
}
}
