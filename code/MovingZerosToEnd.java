package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class MovingZerosToEnd {
public static void main(String[] args) {
	int num[]= {0,1,0,2,3,4,0,5,0};
	movieZerosToEnd(num);
	System.out.println(Arrays.toString(num ));
}
 public static void movieZerosToEnd(int []num) {
	 int size=num.length;
	 if(size==0||size==1) {
		 return;
	 }
	 int nz=0,z=0;
	 while(nz<size) {
		 
		 if(num[nz]!=0) {
			 int temp=num[nz];
			 num[nz]=num[z];
			 num[z]=temp;
			 nz++;z++;
		 }
		 else {
			 nz++;
		 }
	 }
 }
}
