package org.basic.prg.code.repet.code;

public class FindMajarityOfAnElement {
	public static void main(String[] args) {
		int [] az= {8,5,8,1,2,8,8};
//		int []ax= {1,2,1,2,1,2};
		System.out.println(majorityOfAnElement(az));
	} 
	
	
public static int majorityOfAnElement(int az[]) {
	for(int i=0;i<az.length;i++) {
		int count =1;
		for(int j=i+1;j<az.length;j++) {
			if(az[i]==az[j]) {
				count++;
			}
		}
		if(count>az.length/2) {
			return az[i];
		}
	}
	return -1;
}
}
