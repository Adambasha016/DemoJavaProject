package org.prctice.DSA.FAANGM.Quation;

import java.util.ArrayList;
import java.util.List;

// double missing number
public class FindAllDuplicateInAnArray442 {
public static void main(String[] args) {
	int []aq= {4,3,2,7,8,2,3,1};
	System.out.println(findDuplicate(aq));
	
	
}
	
	public static List<Integer> findDuplicate(int[]fgh) {
		int i=0;
		while(i<fgh.length) {
			int correct=fgh[i]-1;
			
			if(fgh[i]!=fgh[correct]) {
				SelectionSort.swap1(fgh, i,correct);
			}
			else {
				i++;
			}
		}
		
		// search for element
		List<Integer> asd= new ArrayList<Integer>();
		for(int j=0;j<fgh.length;j++) {
			if(fgh[j]!=j+1) {
				asd.add(fgh[j]);
			}
		}
		return asd;
		
		
		
	}
}
