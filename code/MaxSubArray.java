package org.basic.prg.code.repet.code;

public class MaxSubArray {
public static void main(String[] args) {
	int as[]= {-1,3,4,-2};
	System.out.println(maxSubArray(as));
	int maxSum=0;
	for(int i=0;i<as.length;i++) {
		for(int j=i;j<as.length;j++) {
			int sum=0;
			for(int k=i;k<=j;k++) {
			sum+=as[k];
		}
			
		maxSum=Math.max(sum,maxSum);
		}
	}
	System.out.println(maxSum);
}
public static int maxSubArray(int ax[]) {
	int maxSum=ax[0];
	int sum=ax[0];
	for(int i=1;i<ax.length;i++) {
		if(sum>0) {
			sum+=ax[i];
		}
		else {
			sum=ax[i];
		}

	if(sum>maxSum) {
		maxSum=sum;
	}
}
	return maxSum;
}
}
