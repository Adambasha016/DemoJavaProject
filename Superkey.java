package org.practice.marathahalli.generalSocite;
class D{
	int i=23;
	static int j=35;
	public static void m3() {
		System.out.println("m3 method in class D");
	}
	public void m2() {
		System.out.println("m2 method in D");
	}
}
class E extends D{
	int i=34;
	public void m2() {
		System.out.println("m2 method in E");
//		this.m2();
		super.m2();
		System.out.println(i);
		System.out.println(super.i);
		System.out.println(super.j);
		System.out.println(D.j);
//		super.m3();
//		D.m3();
//		E.m3();
	}
}
public class Superkey {
public static void main(String[] args) {
	E e=new E();
	e.m2();
	System.out.println("****************");
//	E.m3();  
}
}
