package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int []ax= {4,2,5,1,3};
//	int []ax= {0,1,0,0,1,1,0,1,0,0,1,0};
//	System.out.println(Arrays.deepToString(selectionSort(ax)));
	selectionSort(ax);
//	System.out.println(Arrays.toString(ax));
	
//	System.out.println(getMaxIndex(ax, 0, ax.length-1)+"  index value of maxelement");
	
	
	System.out.println(Arrays.toString(ax));
}
	
	static void selectionSort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int last=a.length-1-i;
			int index = getMaxIndex(a, 0, last);
			swap1(a, index, last);
		}
	}
	static void swap1(int []a,int first,int last) {
		int temp=a[first];
		a[first]=a[last];
		a[last]=temp;
	}
	static int getMaxIndex(int[]a,int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(a[max]<a[i]) {
				max=i;
			}
		}
		return max;
		
	}
}
