package org.practice.marathahalli;

public class Demo1413 {
public static void main(String[] args) {
	     				   	int arr[]= {12,13,1,12,10,34,1,13,12,34,13,45,45,13,34,12  };
print3largestNumber(arr, arr.length);
}
public static void print3largestNumber(int ar[],int size) {
	int first = 0,second = 0,third=0;
	if(size<3) {
		System.out.println("invalid input :");
		return;
	}
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>first) {
			third=second;
			second=first;
			first=ar[i];
		}
		else if(ar[i]>second&&ar[i]!=first) {
			third=second;
			second=ar[i];
		}
		else if(ar[i]>third&&ar[i]!=second&&ar[i]!=first) {
			third=ar[i];
		}
		
		
		
		
	}
	System.out.println(first+"  "+second+" "+third);
}
}
