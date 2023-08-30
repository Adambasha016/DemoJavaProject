package org.basic.prg.code.repet.code.repet;

import java.util.Scanner;

public class AutomophicNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter anumber");
	int num=sc.nextInt();
	int temp=num;
	int length=0;
	int sqrNum=(int) Math.pow(num, 2);
	while(temp!=0) {
		length++;
		temp/=10;
	}
int result=	sqrNum%(int)Math.pow(10,length);
if(result==num) {
	System.out.println("automophic number");
}
else {
	System.out.println(" not aautomophic number");
}
}
}
