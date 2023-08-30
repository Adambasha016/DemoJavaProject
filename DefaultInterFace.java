package org.practice.marathahalli.generalSocite;
interface I3{
	void m1();
	default void m2() {
		System.out.println("m2 metod in I3");
	}
}
class ISI implements I3{

	@Override
	public void m1() {
System.out.println("m1 metod in ISI");		
	}
	
}
class IOS implements I3{

	@Override
	public void m1() {
System.out.println("m1 metod in IOS");		
	}
	public void m2() {
		System.out.println("m2 method in IOS");
	}
	
}
public class DefaultInterFace {
public static void main(String[] args) {
	ISI s=new ISI();
	//s.m1();
	//s.m2();
	I3 s1=new IOS();
	s1.m1();
	s1.m2();
}
}
			