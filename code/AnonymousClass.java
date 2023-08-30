package org.basic.prg.code.repet.code;
interface ASD{
	public void m1();
	public void m2();
}
abstract class FGH{
	public abstract void m3();
}
public class AnonymousClass {
	public static void main(String[] args) {
		ASD z=new ASD(){
			@Override
			public void m1() {
				System.out.println("ASD m1 methid");
			}
			@Override
			public void m2() {
				System.out.println("ASD m2 method");
			}
		};
		z.m1();
		z.m2();
		FGH x=new FGH() {
			public void m3() {
				System.out.println("FGH m3 method");
			}
		};
		x.m3();
	}
}
