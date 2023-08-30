package org.prctice.DSA.FAANGM.Quation;

import java.util.ArrayList;
import java.util.List;

// the values shoud be 1 to n 
// number start from 1 to n  
public class FindMissingNumberFrom1ToNLeetcode448 {
	public static void main(String[] args) {
//		int []num= {4,3,2,7,8,2,3,1};
		int[]num= {1,1};
		System.out.println(findDisappearNumber(num));
	}
	
public static List<Integer> findDisappearNumber(int[]num) {
	int i=0;
	while(i<num.length) {
		int correcrIndex=num[i]-1;
		if(num[i]!=num[correcrIndex]) {
			SelectionSort.swap1(num, i,correcrIndex);
		}else {i++;
		
		}
	}
	//find the missing number
	List<Integer> li=new ArrayList<Integer>();
	for(int index=0;index<num.length;index++) {
		if(num[index]!=index+1) {
			li.add(index+1);
		}
}
	return li;
	
	
	
}
}