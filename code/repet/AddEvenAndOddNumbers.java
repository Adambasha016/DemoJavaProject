package org.basic.prg.code.repet.code.repet;

public class AddEvenAndOddNumbers {
public static void main(String[] args) {
	int []ad= {2,4,6,8,9,24,13,14,18,27};
	addEvenAndOddNumbes(ad);
}
public static void addEvenAndOddNumbes(int as[]) {
	int evenCount = 0,oddCount=0;
	int evenSum = 0,oddSum=0;
	for(int j=0;j<as.length;j++) {
		if(as[j]%2==0) {
			evenSum=evenSum+as[j];
			evenCount++;
			}
		else {
			oddSum+=as[j];
			oddCount++;
		}
	}
	System.out.println(evenCount+" "+evenSum);
	System.out.println(oddCount+" "+oddSum);
}
}
