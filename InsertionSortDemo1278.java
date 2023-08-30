package org.Itpl.Diatoz;

public class InsertionSortDemo1278 {
public static void main(String[] args) {
	 int arr[]= {2,5,3,8,6,9,1};
	 sortInsertion(arr);
	 for(int a:arr) {
		 System.out.println(a);
	 }
}
public static void sortInsertion(int []arr) {
	for(int i=1;i<arr.length;i++) {
		int key=arr[i];
		int j=i-1;
		while     (j>-1&&arr[j]>key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
		
	}
}
}
