package org.practice.marathahalli.generalSocite;

public class Shadowing {
static int x=98;
	public static void main(String[] args) {
	System.out.println(x);//98// shadowing 
	int x=34;// local variable   shadowing will beging when value is intilized 
	System.out.println(x);// 34 
	fun();
}
	static void fun() {
		System.out.println(x);// 98
	}
}
// method shadowing not aplicable