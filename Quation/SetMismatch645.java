package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

//it is to find the missing number and which number is repeted moretimes we need to return. repeted number and missing number both in array
public class SetMismatch645 {
public static void main(String[] args) {
//	int []asd={2,1,4,2,6,5};
//	int []asd={1,2,2,4};
	int []asd={1,1};
	int[] number = missingNumber(asd);
	System.out.println(Arrays.toString(number));
}


	public static int[] missingNumber(int []asd) {
		int i=0;
		while(i<asd.length) {
			int correctIndex=asd[i]-1;
			if(asd[i]!=asd[correctIndex]) {
				SelectionSort.swap1(asd, i,correctIndex);
			}
			else {i++;
			}
		}

		// serchig for that eleme nt
		for(int index=0;index<asd.length;index++) {
			if(asd[index]!=index+1) {
				return new int[] {asd[index],index+1};
			}
		}
		return new int[] {-1,-1};	
	}
}
