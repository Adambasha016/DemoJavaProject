package org.practice.marathahalli.generalSocite;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchArrayIn2DArray {
public static void main(String[] args) {
	int [][]as= {
			{23,4,5},
			{18,12,3,9},
			{78,99,34,56},
			{18,21}
	};
	int target=188;
			int[] array = seachIn2DArray(as, target);
	System.out.println(Arrays.toString(array));
}
	public  static int[] seachIn2DArray(int [][]as,int target) {
		for(int row=0;row<as.length;row++) {
			for(int col=0;col<as[row].length;col++) {
				if(as[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
}

