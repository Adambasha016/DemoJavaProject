 package org.basic.prg.code.repet.code;

public class BitonicElement{
	public static void main(String[] args) {
		int []a= {5,6,7,8,9,10,3,2,1};
		int b=2;
		int bindex=BSeach.findBitonicElement(a);
		System.out.println(BSeach.searchBitonic(a, b, bindex));
	}
}
class BSeach
{
	public static int ascendingSearch(int []a,int key,int range) {
		int l=0,h=range,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
	}
	public static int desendingBinarySeach(int []a,int key,int range) {
		int l=range,h=a.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if(key<a[mid]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return -1;
	}
	public static int findBitonicElement(int []a) {
		int l=0,h=a.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]) {
				return mid;
			}
			else if (a[mid]>a[mid-1]&&a[mid]<a[mid+1]) {
				l=mid;
			}
			else {
				h=mid;
			}
		}
		return -1;
	}

	public static int searchBitonic(int []a,int key,int bindex) {
		if(key==a[bindex]) {
			return bindex;
		}
		if(key>a[bindex]) {
			return -1;
		}
		int res1=ascendingSearch(a, key, bindex-1);
		if(res1!=-1) {
			return res1;
		}
		int res2=desendingBinarySeach(a, key, bindex+1);
		if(res2!=-1) {
			return res2;
		}
		return -1;
	}
}
