package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

//import com.sun.javafx.collections.SortableList;

public class QuickSort {
public static void sortQuick(int []num,int s,int e) {
	if(s>=e) {
		return;
	}
	int start=s;
	int end=e;
	int mid=start+(end-start)/2;
	int pivot=num[mid];
	while(start<=end) {
		while(num[start]<pivot) {
			start++;
		}
		while(num[end]>pivot) {
			end--;
		}
		if(start<=end) {
			int temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}
	}
	
	sortQuick(num, s, end);
	sortQuick(num, start, e);
}

public static void main(String[] args) {
	int []num= {5,4,3,2,1};
	sortQuick(num, 0, num.length-1);
	System.out.println(Arrays.toString(num));
}



}
