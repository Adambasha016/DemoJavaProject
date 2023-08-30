package org.basic.prg.code.repet.code;

public class ChekingGivenArrayIsSortedOrNot {
public static void main(String[] args) {
	int []s= {2,4,6,8,12,14};
	System.out.println(isSorted(s));
}
	public static boolean isSorted(int []de) {
		for(int i=1;i<de.length;i++) {
			if(de[i]<de[i-1]) {
				return false;
			}
		}
		return true;
	}
}
