package org.prctice.DSA.FAANGM.Quation;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SeachInRoatedSortedArray {
public static void main(String[] args) {
	int []ax= {3,4,5,6,7,0,1,2};
	System.err.println(search(ax,7 ));
}
	
	static int search(int[] as,int target) {
	int pivot=findpivot(as);
	if(pivot==-1) {
		return binarySearch(as,target,0,as.length-1);
	}
	if(as[pivot]==target) {
		return target;
	}
	if(target>=as[0]) {
		return binarySearch(as,target,0,pivot-1);
}
	return binarySearch(as,target,pivot+1,as.length);
}
static int binarySearch(int []az,int target,int s,int end) {
	while(s<=end) {
		int mid=s+(end-s)/2;
		if(target<az[mid]) {
			end=mid-1;
		}
		else if(target>az[mid]) {
			s=mid+1;
		}else {
			return mid;
		
	}
}
return -1;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// find the pivot in distic elemet no duplicate are avalible
	//[3,4,5,6,7,0,1,2]
	static int findpivot(int []a) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end&&a[mid]>a[mid+1]) {
				return mid;
				
			}
			if(mid>start&&a[mid]<a[mid-1]) {
				return mid-1;
			}
			if(a[mid]<=a[start]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
	  return -1;
	}
	 
	
	
	
}
 