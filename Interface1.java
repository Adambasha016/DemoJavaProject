package org.practice.marathahalli.generalSocite;

interface Phone{
	void call();
	void on();
}
interface Camera{
	void on();
	void capturePhoto();
}
class Samsung implements Phone,Camera{
	public void call() {
		System.out.println("call in sumsung s23");
	}
	public void capturePhoto() {
		System.out.println("capturehoto usiung samsung s23 ultra");
	}
	public void on() {
		System.out.println("device is swich on");
	}
}
public class Interface1 {
public static void main(String[] args) {
	Samsung s=new Samsung();
//	s.call();
//	s.capturePhoto();
//	s.on();
	 Phone p=new Samsung();
//	p.call();
//	 p.on();
	Camera c=new Samsung();
//	c.capturePhoto();
	c.on();
}
}
