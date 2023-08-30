package org.practice.marathahalli.generalSocite;
class Demo{
	int i;
	Demo(int i){
		this.i=i;
	}
}
interface Display{
	void show();
	
}
class Chaild extends Demo implements Display{
	int j;
	public Chaild(int i,int j) {
		super(i );
       this.j=j;
	}
	public void show() {
		System.out.println(i+ " i");
		System.out.println(j+ " j");
	}
}
public class Interface3 {
public static void main(String[] args) {
	Chaild s=new Chaild(20, 40);
//	s.show();
	Display d=new Chaild(30, 34);
	d.show();
	
}
}
