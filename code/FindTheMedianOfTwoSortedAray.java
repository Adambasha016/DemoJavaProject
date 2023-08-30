package org.basic.prg.code.repet.code;
class merge{
  public static float mergeTwoArray(int[]a,int []b) {
		int i=0,j=0,k=0;
		int []merge=new int [a.length+b.length];
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				merge[k++]=a[i++];	
			}
			else {
				merge[k++]=b[j++];
			}
		}
		while(i<a.length) {
			merge[k++]=a[i++];
		}
		while(j<b.length) {
			merge[k++]=b[j++];
		}
		
		if(merge.length%2==0) {
	
			int mid=merge.length/2;
			return(float) (merge[mid]+merge[mid-1])/2;
		}
		else {
			int mid=merge.length/2;
			System.out.println(mid);
			return merge[mid];
		}
	}
	
	
}
public class FindTheMedianOfTwoSortedAray {
public static void main(String[] args) {
//	int []m= {1,3,5,6,7,8,17,19,21};
//	int []n= {1,3,5,6,7,8,7,19,21,25};
	
	int []m= {1,3,8,1,7};
	int []n= {5,6,7,19,21,25};
	System.out.println(merge.mergeTwoArray(m,n));
}
}
