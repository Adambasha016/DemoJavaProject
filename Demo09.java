package org.Itpl.Diatoz;
class Parent{
	void show() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("child");
	}
}
class GrandChild extends Child{
	void show() {
		System.out.println("Grandchild");
	}

}
public class Demo09 {
public static void main(String[] args) {
  Parent o1= new GrandChild();
  Parent o2= new Child();
o1.show();
o2.show(); 
}
}

