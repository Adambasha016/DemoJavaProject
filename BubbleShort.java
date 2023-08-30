package org.Itpl.Diatoz;

public class BubbleShort {
	public static void main(String[] args) {
		int []ar= {3,7,8,9,4,2,1,5};
		bubbleShort(ar);
		for(int y:ar){
			System.out.println(y);
		}
	}
	
	
	
	public static void bubbleShort(int []ar) {
	for(int i=0;i<ar.length-1;i++) {
		for(int j=0;j<ar.length-i-1;j++) {
			if(ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
}
}
