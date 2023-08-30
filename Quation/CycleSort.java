package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;
// its range from 1 to n values ,the values should be continous element 
//it only aplicable for 1 to n values given in continous element but at randam palces then we cn arrange the number
//index=values -1;
// if we take value 2 it shoud be placed at 2-1=1 index if it sorted
public class CycleSort {

	public static void main(String[] args) {
//		int []as= {3,5,2,1,4};
//		int []o= {2,-2,0,1,3,-9,4};//not applicable
//		int []as= {3,0,1};not applicable 
		int []as= { 9,4,2,3,8,5,7,6,1};
		
		cycleSort(as);
		System.out.println(Arrays.toString(as));
	}
	
	static void cycleSort(int[]as) {
		int i=0;
		while(i<as.length) {
			int correctIndex=as[i]-1;
			if(as[i]!=as[correctIndex]) {
				SelectionSort.swap1(as, i,correctIndex);
			}
			else {
				i++;
			}
		}
	}
}
