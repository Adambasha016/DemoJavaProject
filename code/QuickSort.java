package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class QuickSort {
public static void main(String[] args) {
	int s[]= {9,2,8,4,6,7,3,1,5};
	sortQuick(s, 0, s.length-1);
	System.out.println(Arrays.toString(s));
}
	
	
	
	
	
	
	public static void sortQuick(int []y,int start,int end) {
	  
	  
	  if(start>=end) return;
	  int pivot=y[(start+end)/2];
	  int i=start,j=end;
	  while(i<=j) {
		  while(y[i]<pivot)i++;
		  while(y[j]>pivot)j--;
		  if(i<=j) {
			  int temp=y[i];
			  y[i]=y[j];
			  y[j]=temp;
			  i++;
			  j--;
		  }
	  }
	  sortQuick(y, start, j);
	  sortQuick(y, i,end);
	
  }
}
