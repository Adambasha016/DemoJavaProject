package org.prctice.DSA.FAANGM.Quation;

public class SeachIn2DMatrix {
	public static void main(String[] args) {
		int[][]ad= { {18,9,12},
				     {36,-4,91},
				     {44,33,16}
		};
		int target=12;
		for(int i=0;i<ad.length;i++) {
			for(int j=0;j<ad[i].length;j++) {
				if(ad[i][j]==target) {
					System.out.println(i+","+j);
				}
			}
		}
//		System.out.println(-1+"  no element found");
	}
}
