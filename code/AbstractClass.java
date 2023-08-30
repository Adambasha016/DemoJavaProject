package org.basic.prg.code.repet.code;

public class AbstractClass {
	public static void main(String[] args) {
		A a=	new B();
		a.accessPriivate();
	}
}



abstract class A{
	private void m1() {
		System.out.println("m1() private method");
	}
	public void accessPriivate() {
		m1();
	}
}    
class B extends A{
	
 }











