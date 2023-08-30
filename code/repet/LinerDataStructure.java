package org.basic.prg.code.repet.code.repet;

public class LinerDataStructure {

	public static void main(String[] args) {
		int []a= {20,34,56,78,33,45,47,78,0};
		System.err.println(linerSearch(a, 56));
	}
	
	
	
	static int linerSearch(int []a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
			return -1;
		}
	
}
