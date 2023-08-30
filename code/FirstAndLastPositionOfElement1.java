package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class FirstAndLastPositionOfElement1 {
	public static void main(String[] args) {
		int num[]= {5,7,7,8,8,10};
		//		int num[]= {3,4,4,4,4,4,4,4,4,9};
		serch2(num,8 );
		//		int[] is = serch1(num, 8);
		//		for(int s:is) {
		//			System.out.print(s+" ");
		//		}
	}

	public static void serch2(int []n,int target) {
		int le = n.length;
		int first = -1, last = -1;
		for (int i = 0; i < le; i++) {
			if (target != n[i])
				continue;
			if (first == -1)
				first = i;
			last = i;
		}
		if (first != -1) {
			System.out.println("First Occurrence = "
					+ first);
			System.out.println("Last Occurrence = " + last);
		}
		else
			System.out.println("Not Found");
	}	 
	public static int[]serch1(int []n,int target) {
		Arrays.sort(n);
		int[]result= {-1,-1};
		outerloop:for(int i=0;i<n.length-1;i++) {
			if(n[i]==target) {
				result[0]=i;
			      for(int j=i+1;j<n.length;j++) {
					if(n[i]==n[j]) {
						result[1]=j  ;
					}
					else {
						break outerloop;
					}
				}
			} 
		}
		return result;
	}


}

























