package org.basic.prg.code.repet.code;

public class ConsecutiveOnesInAnArray {
public static void main(String[] args) {
	int ax[]= {0,1,1,1,1,0,1,1,0,0};
	System.out.println(findConseutiveOnes(ax));
	
}
public static int findConseutiveOnes(int a[]) {
	int count=0;
	int maxCount=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==0) {
			count=0;
		}
		else {
			count++;
		maxCount = Math.max(count, maxCount);
		}
	}
	return maxCount;
	
}


}
