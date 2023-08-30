package org.basic.prg.code.repet.code.repet;

public class LongestCommonPrefix1 {
	public static void main(String[] args) {

		String ax="flower";
		//	System.out.println(ax.indexOf("flight"));

		String a[]= {"flower","flow","flight"};
		int n=a.length;
		String rezult=a[0];
		for(int i=1;i<n;i++) {
			while(a[i].indexOf(rezult)!=0) {
				System.out.println(a[i].indexOf(rezult)+"   cout");
				System.err.println(rezult);
				rezult=rezult.substring(0,rezult.length()-1);
				System.out.println(rezult+"    ad");
				if(rezult.isEmpty()) {
					System.out.println(-1);
				}
			}
		}
		System.out.println(rezult);
	}
}
