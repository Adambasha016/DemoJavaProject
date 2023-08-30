package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

public class SearchInSortedMatrix {
	public static void main(String[] args) {
		int [][]matrix= { {1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};

		System.out.println(Arrays.toString(search2D(matrix, 14)));


	}


	static int[] search2D(int [][]ma,int target) {
		int row=ma.length;
		int col=ma[0].length;
		if(row==1) {
			return binarySerch(ma,0,0,col-1,target);
		}
		int rStart=0;
		int rEnd=row-1;
		int cMid=col/2;

		while(rStart<(rEnd-1)) {
			int mid=rStart+(rEnd-rStart)/2;
			if(ma[mid][cMid]==target) {
				return new int[] {mid,cMid};
			}
			if(ma[mid][cMid]<target) {
				rStart=mid;

			}else {rEnd=mid;}

		} 
		//		                                                          {1,2,3,4},
		//                                                                 {5,6,7,8},
		//                                                                 {9,10,11,12},
		//      now we have tow rows                                      {13,14,15,16}
		//		chexk whether the target is inthe colof 2 rows  
		if(ma[rStart][cMid]==target) {
			return new int[] {rStart,cMid };
		}
		if(ma[rStart+1][cMid]==target) {
			return new int[] {rStart+1,cMid };
		}
		//		chech in 1 st hlf
		if(target<=ma[rStart][cMid-1]) {
			return binarySerch(ma,rStart,0,cMid-1,target);
		}
		//		search in 2nd half
		if(target>=ma[rStart][cMid+1]&& target<=ma[rStart][col-1]) {
			return binarySerch(ma,rStart,cMid+1,col-1,target);
		}
		//		search in 3rd half
		if(target<=ma[rStart+1][cMid-1]) {
			return binarySerch(ma,rStart+1,0,cMid-1,target);
		}
		//	search in 4th half
		else {

			return binarySerch(ma,rStart+1,cMid+1,col-1,target);
		}

	}


	static int[] binarySerch(int[][] as,int row,int s,int e,int target) {
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(as[row][mid]==target) {
				return new int[] {row,mid};
			}
			if(as[row][mid]<target) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return new int[] {-1,-1};
	}
}
