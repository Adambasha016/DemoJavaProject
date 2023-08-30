package org.basic.prg.code.repet.code;

public class LeaderInAnArray {
public static void main(String[] args) {
	int []xx= {8,11,5,11,7,6,3};
	leader12(xx);
}
public static void leader12(int []a) {
	int curr_leader=a[a.length-1];
	System.out.println(curr_leader+" as");
	for(int i=a.length-2;i>=0;i--) {
		if(a[i]>curr_leader) {
			curr_leader=a[i];
			System.out.println(curr_leader);
		}
	}
}

}
