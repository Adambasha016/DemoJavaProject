package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

public class Mergesort {
	
	
	
public static int[] mergeSort1(int[]ar) {
	if(ar.length==1) { 
		return ar;
	}
	int mid=(ar.length/2);
	int []left=mergeSort1(Arrays.copyOfRange(ar, 0, mid));
	int []right=mergeSort1(Arrays.copyOfRange(ar, mid,ar.length));
	return merge1(left,right);
}

private static int[] merge1(int []first,int []secod) {
	int mix[]=new int[first.length+secod.length];
	int i=0;
	int j=0;
	int k=0;
	while(i<first.length&&j<secod.length) {
		if(first[i]<secod[j]) {
			mix[k]=first[i];
			i++;
		}
		else {
			mix[k]=secod[j];
			j++;
		}
		k++;
	}
	//if may possible that one of arrray not completed
	//add all remaining elements
	while(i<first.length) {
		mix[k]=first[i];
		i++;
		k++;
	}
	while(j<secod.length) {
		mix[k]=secod[j];
		j++;
		k++;
		
	}
	return mix;
	
	
}
public static void main(String[] args) {
	int []num= {4,3,6,2,8,1,5,7};
	num = mergeSort1(num);
	System.out.println(Arrays.toString(num));
}



}
