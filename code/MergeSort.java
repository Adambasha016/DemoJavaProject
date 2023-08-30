package org.basic.prg.code.repet.code;

import java.util.Arrays;
public class MergeSort {
public static void main(String[] args) {
		int s[]= {4,7,5,3,2,1,9,10};
		sortMerge(s);
		System.out.println(Arrays.toString(s));
	}
		
  public static void sortMerge(int []u) {
	  if(u.length==1) return;
	  int left[]=new int [u.length/2];
	  int right[]=new int [u.length-left.length];
	  for(int i=0;i<left.length;i++) {
		  left[i]=u[i];
	  }
	  int i=left.length;
	  for(int j=0;j<right.length;j++,i++) {
		  right[j]=u[i];
	  }
	  sortMerge(left);
	  sortMerge(right);
	  merge1(left,right,u);
  }
  private static void merge1(int []a,int []b,int []c) {
	  int k=0,i=0,j=0;
	  while(i<a.length&&j<b.length) {
		  if(a[i]<b[j]) {
			  c[k++]=a[i++];
		  }
		  else {
			  c[k++]=b[j++];
		  }	  
	  }
	  while(i<a.length) c[k++]=a[i++];
	  while(j<b.length) c[k++]=b[j++];
  }
}





































