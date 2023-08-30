package org.practice.marathahalli.generalSocite;

import java.util.Arrays;

public class FindTheFistAndlastPositionOfElementInaSortedArray {
public static void main(String[] args) {
	int []a= {5,7,7,8,8,10};
	int target=8;
	int[] search = search(a, target);
	System.out.println(Arrays.toString(search));
}
public static int [] search(int []a,int t) {
	int [] ans= {-1,-1};
	ans[0]=serchinRange(a, t, true);
	if(ans[0]!=-1) {
	ans[1]=serchinRange(a, t, false);
	}
	return ans;
}


public static  int serchinRange(int []as,int target,boolean findStartIndex) {
	int ans=-1;
	int s=0;
	int end=as.length-1;
	while(s<=end) {
		int mid=s+(end-s)/2;
		if(as[mid]==target) {
			ans=mid;
			if(findStartIndex  ) {
				end=mid-1;
			}else {
				s=mid+1;
			}
		}
		else if(target<as[mid]) {
			end=mid-1;
		}else {
			s=mid+1;
		}
	}
	return ans;
}
}
