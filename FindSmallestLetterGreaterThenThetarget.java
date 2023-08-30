package org.practice.marathahalli.generalSocite;

public class FindSmallestLetterGreaterThenThetarget {
	public static void main(String[] args) {
		char []as= {'c','f','j'};
		//   char target='a';
		//   char target='c';
		char target='d';
		System.out.println(nextgreastLetter(as, target));
	}
	public static char nextgreastLetter(char[]az,char target) {
		int start=0;
		int end=az.length-1;
		while(start <=end) {
			int mid=start+(end-start)/2;
			if(target<az[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return az[start%az.length];
	}
}
