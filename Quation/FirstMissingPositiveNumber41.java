package org.prctice.DSA.FAANGM.Quation;

public class FirstMissingPositiveNumber41 {
	public static void main(String[] args) {
//		int[] zxc= {-1,1,3,4};
//		int[] zxc= {1,2,0};
//		int[] zxc= {3,4,-1,1};
		int[] zxc= {7,8,9,11,12};
		System.out.println(missingPositiveNumber(zxc));
	}
	
public static int missingPositiveNumber(int[]zxc) {
	int i=0;
	while(i<zxc.length) {
		int correct=zxc[i]-1;
		if(zxc[i]>0&&zxc[i]<=zxc.length&&zxc[i]!=zxc[correct]) {
		SelectionSort.swap1(zxc, i, correct);
		}
		else {
			i++;
		}
	}
	//missingfir stPositive number
	for(int a=0;a<zxc.length;a++) {
		if(zxc[a]!=a+1) {
			return a+1;
		}
	}
	return -1;
}
}
