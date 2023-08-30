package org.basic.prg.code.repet.code;

import java.util.Arrays;

public class AddingRepetedNumberAtOnes {
public static void main(String[] args) {
	int[]ax= {10,5,4,3,5,3,6,8};
	System.out.println(addepetedNumber(ax));
}
public static int addepetedNumber(int ax[]) {
	Arrays.sort(ax);
	int sum=0;
	for(int i=0;i<ax.length;i++) {
		int count=1;
		for(int j=i+1;j<ax.length;j++) {
			if(ax[i]==ax[j]) {
				count++;
				i=j;
			}
			
		}
		if(count>1) {
			sum+=ax[i];
		}
	}
	return sum;
}
}
