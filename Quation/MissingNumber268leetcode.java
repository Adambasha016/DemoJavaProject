package org.prctice.DSA.FAANGM.Quation;


public class MissingNumber268leetcode {
	public static void main(String[] args) {
//		int as[]= {1,0,2,3};
		int as[]= {3,0,4,1};
//		int as[]= {0,1};
//		int as[]= {3,0,1};
		
		System.err.println(missingNumber(as));
	}
	
	
	
	static  int missingNumber(int []as) {
		int i=0;
		while(i<as.length) {
			int currectIndex=as[i];
			if(as[i]<as.length&&as[i]!=as[currectIndex]) {
				SelectionSort.swap1(as, i,currectIndex);			
			}
			else {i++; 

			}
		}
		// search for fist missing number
		for(int  index=0;index<as.length;index++) {
			if(as[index]!=index) {
				return index;
			}
		}
		return as.length;
	}
}
