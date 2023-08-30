package org.prctice.DSA.FAANGM.Quation;
//single duplicate valu
public class FindDuplicateNumber287 {
	public static void main(String[] args) {

		int nuh[]= {1,3,4,2,2};
		//int	nuh[]= {1,1,2};
		//int	nuh[]= {3,1,3,4,2};
		//int	nuh[]= {1,1};
		System.out.println(findDuplicate(nuh));


	}
	public static int findDuplicate(int[] nuh) {
		int i=0;
		while(i<nuh.length) {
			if(nuh[i]!=i+1) {
				int correct =nuh[i]-1;
				if(nuh[i]!=nuh[correct]) {
					SelectionSort.swap1(nuh, i,correct);
				}else {
					return nuh[i];
				}
			}
			else {
				i++;
			}
		}
		return-1;
	}


}
