package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class MovieZerosToEndOfAnArray {
public static void main(String[] args) {
//	int nm[]= {0,2,0,4,0,5,0,0,7};
	int nm[]= {1,2,0,0,4,0,7,9,0,10};
	movieZeros(nm);
 	System.out.println(Arrays.toString(nm));
}
public static void movieZeros(int[]num) {
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
