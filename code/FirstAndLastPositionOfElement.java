package org.basic.prg.code.repet.code;

public class FirstAndLastPositionOfElement {
	
	
public  static int[] searchange(int []num,int target) {
	int l=0,h=num.length-1,mid=0;
	int []res= {-1,-1};
	while(l<=h) {
		mid=(l+h)/2;
		if(target==num[mid]) {
			res[0]=mid;
			h=mid-1;
		}
		else if(target<num[mid]) {
			h=mid-1;
			
		}
		else {
			l=mid+1;
		}
	}
	l=0;h=num.length-1;
			mid=0;
	while(l<=h) {
		mid=(l+h)/2;
		if(target==num[mid]) {
			res[1]=mid;
			l=mid+1;
		}
		else if(target<num[mid]) {
			h=mid-1;
		}
		else {
			l=mid+1;
		}
	}
	return res;
	
}

public static void main(String[] args) {
	int num[]= {5,7,7,8,8,10};
	int target=8;
	int[] is = searchange(num, target);
	for(int se:is) {
	System.out.print(se+" ");
}}



}
