package org.practice.marathahalli.generalSocite;
class A{
	static int i=20;
	public static void m1() {
		System.out.println("m1 method in clss A");
	}
}
class B extends A{
	static int i=38;
	
	public static void m1() {
		A.m1();
		System.out.println("m1 metod in class B");
		//super.m1();
		System.out.println(i);
//		System.out.println(super.i);
	}
}
public class SuperKeyWord {
public static void main(String[] args) {
//	B b1=new B();
//	b1.m1();
	B.m1();
}
}
