package org.Itpl.Diatoz;

public class Demo05 {
	static {
		System.out.println(1+"   static");
	}
	{
		System.out.println(2+"  non static");
	}
	static {
		System.out.println(3+" static");
	}
	{
		System.out.println(4+" non stsatic");
	}
public static void main(String[] args) {
	Demo05 e0 = new Demo05();
	e0.message();
}
public static void message() {
	System.out.println(" welcome to heave though hell");
}
}
