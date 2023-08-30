package org.prctice.DSA.FAANGM.Quation;
// leetcode 852 
public class PeakIndexInAMountainArry {
public static void main(String[] args) {
//	int []a= {0,1,0};
	int []a= {0,10,5,2};
	System.out.println(peakIndex(a));
}
public static int peakIndex(int []a) {
	int start=0;
	int end=a.length-1;
	while(start<end) {
		int mid=start+(end-start)/2;
		if(a[mid]>a[mid+1]) {
			// u are in dec part of array
			//this may be ans but look left
			// we this may be end!=mid-1
			end=mid;
		}
		else {
			// ur in asc part o array
			start=mid+1;
		}
	}
	return start;
			
}
	
	
	
}
