package org.basic.prg.code.repet.code.repet;
class Trimph400x{
	static public void bike() {
		System.out.println("trimph 400x");
	}
}
class Hardly400 extends Trimph400x{
	static public void bike() {
		System.out.println("hardly");
	}
}
public class MethodHidding {
public static void main(String[] args) {
	Trimph400x t=new Hardly400();
	t.bike();    
	Hardly400 h=new Hardly400();
	h.bike();  
	
}
}
