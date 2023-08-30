package org.practice.marathahalli.generalSocite;

public class ScopeDemo1 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	String name="alen";
	System.out.println(name);// alen
	{
		name="smith";//we updating the value updating same reference value
		
//		int a=23;// we can not re-intilize becouse it intlilize out side the blok in same method
		a=49;// we update the value any think outside blok but in same method we can update 
		int c=30;// value initlilize will remain inside block out side not accessble
		System.out.println(c);// we can use inside this block only we can not use outside    30 
	}
	System.out.println(name);// smith     value updated in same reference 
	System.out.println(a); /// 49 value updated
//	System.out.println(c);//it is not visible out side the block  error
	int c= 34;// it belogs to this scop 
	
}
}
