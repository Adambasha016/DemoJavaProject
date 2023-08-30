package org.prctice.DSA.FAANGM.Quation;
//leetcode1095
public class FindInMountainArray1095 {
	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5,3,1};
		int target=3;
		System.out.println(seaarch(ar, target));
	}

	public static int seaarch(int[]a,int target) {
		int peak= PeakIndexInAMountainArry.peakIndex(a);
		int firstTry=orderAgnosticBs(a, target, 0, peak);
		if(firstTry!=-1) {
			return firstTry;
		}
		return orderAgnosticBs(a, target, peak+1, a.length-1);
	}


	public static int orderAgnosticBs(int []as,int target,int sratr,int end) {
		boolean isasc=as[sratr]<as[end];
		  
		while(sratr<=end) {
			
			int mid=sratr+(end-sratr)/2;
			
			if(as[mid]==target) {
				return mid;
			}
			if(isasc){
				if(target<as[mid]) {
					end=mid-1;
				}
				else {
					sratr=mid+1;
				}
			}
			else {
				if(target>as[mid]) {
					end=mid-1;
				}else {
					sratr=mid+1;
				}
			}
		}
		return -1;
	}
}
