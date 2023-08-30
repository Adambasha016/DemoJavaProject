package org.prctice.DSA.FAANGM.Quation;

public class FindPositionOfAnElementInASortedArryOfInfinityArray {
public static void main(String[] args) {
	int [] as= {3,5,7,9,10,90,130,140,160,170,180,188,190,199,200,208,213,217};
	int target=10 ;
	System.out.println(ans(as, target));
	
}
public static int ans(int []a,int target) {
	int start=0;
	int end=1;
	while(target>a[end]) {
		int temp=end+1;
		end=end+(end-start+1)*2;
		start=temp;
	}
	return binarySearch(a, target, start, end); 
}
public static int binarySearch(int []p,int h,int start,int end) {

while(start<=end) {
	int mid=start+(end-start)/2;
	if(h==p[mid]) {
		return mid;
	}
	else if(h<p[mid])
	{
		end=mid-1;
	}
	else {
		start=mid+1;
	}
}
return -1;
}
}
