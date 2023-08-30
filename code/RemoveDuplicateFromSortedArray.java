 package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
public static void main(String[] args) {
	int az[]= {2,2,3,3,4,5,6,6};
//	System.err.println(Arrays.toString(az));
	int qw = removieDuplicate(az);
//	System.err.println(Arrays.toString(az));
	for(int i=0;i<qw;i++) {
		if(i==0)System.out.print("After Removing Duplicates --> "+"[");
		System.out.print(az[i]);
		if(i<qw-1)System.out.print(",");
	}
	System.out.println("]");
	
	
}

public static int removieDuplicate(int []a) {
	int ed=0;
	for(int i=1;i<a.length;i++) {
		if(a[i]!=a[ed]) {
			ed++;
			a[ed]=a[i];
		}
	}
	return ed+1;
}
}
