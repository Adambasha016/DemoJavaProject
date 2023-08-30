package org.prctice.DSA.FAANGM.Quation;

import java.util.Scanner;

public class CheckNumberIsEvenOrOddWithOutUsingAnyOperator {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner as =new Scanner(System.in);
	int int1 = as.nextInt();
//	System.out.println(even1(int1));
	int i = even2(int1);
	if(i==1)System.out.println("odd");
	else System.out.println("even");
}
public static boolean even1(int d) {
	 return (d/2)*2==d;
}


public static int even2(int d) {
	System.out.println(d&1);
	 return(d&1);
}


}
