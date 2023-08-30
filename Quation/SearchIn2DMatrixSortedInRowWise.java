package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

public class SearchIn2DMatrixSortedInRowWise {
	public static void main(String[] args) {
		int[][]az= { {10,20,30,40},
			       	 {15,25,35,45},
				     {18,28,37,49},
			         {33,34,38,50}
		};
		System.out.println(Arrays.toString(serchIn2DArrray(az, 49)));

	}
	static int[] serchIn2DArrray(int[][]as,int target) {
		int row=0;
		int col=as.length-1;
		while(row<as.length&&col>=0) {
			if(as[row][col]==target) {
				return new int[] {row,col};
			}
			if(as[row][col]<target) {
				row++;

			}
			else {
				col--;
			}
		}
		return new int[] {-1,-1};
	}
}
