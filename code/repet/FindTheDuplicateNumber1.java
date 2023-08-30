package org.basic.prg.code.repet.code.repet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//There is only one repeated number in nums, return this repeated number.
class Solution {
	public static  int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		while (true) {
			slow = nums[slow];
			fast = nums[nums[fast]];

			if (slow == fast) {
				break;
			}
		}

		slow = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;
	}
	public static  int findDuplicate1(int[] nums) {
		for(int i = 0; i< nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] == nums[j]){
					return nums[i];
				}
			}
		}
		return nums.length;
	}

	public static  int findDuplicate2(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int num:nums){
			//    	System.out.println(set.add(num));
			if(!set.add(num)){
				return num;
			}
		}

		return nums.length;
	}

	public static  int findDuplicate3(int[] nums) {
	 Arrays.sort(nums);
	    for(int i = 0; i < nums.length - 1; i++){
	        if(nums[i] == nums[i + 1]){
	            return nums[i];
	        }
	    }
	    return -1;
	}

}
public class FindTheDuplicateNumber1 {
	public static void main(String[] args) {
//			int num[]= {3,1,3,4,2};
		int num[]= {3,1,4,2,2};
		System.out.println(Solution.findDuplicate3(num));
		System.err.println(Solution.findDuplicate1(num));
		System.err .println(Solution.findDuplicate2(num));
		System.out.println(Solution.findDuplicate(num));
	}
}
