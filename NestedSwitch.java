package org.practice.marathahalli.generalSocite;

import java.util.Scanner;

public class NestedSwitch {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int empId=sc.nextInt();
	String dept=sc.next();
	switch(empId) {
	case 1:
		System.out.println("paul ");
		break;
	case 2:
		System.out.println("alen");
		break;
	case 3:
		System.out.println("maran");
		switch(dept) {
		case "IT":
			System.out.println( "IT dept");
			break;
		case "management":
			System.out.println("management ");
			break;
			default:
				System.out.println("no deptno");
		}
		break;
		
		default:
			System.out.println("enter currect id");
	}
}
}
