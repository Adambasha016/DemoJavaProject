package org.basic.prg.code.repet.code.repet;
class Test{
	private static Test m=null;
	private  Test() {
		
	}
	public static Test getInstance() {
		if(m==null) m=new Test();
		return m;
	}
}
public class SingleTurnClass {
public static void main(String[] args) {
	Test t1 = Test.getInstance();
	Test t2 = Test.getInstance();
	Test t3 = Test.getInstance();
	System.out.println(t1==t2);
	System.out.println(t1==t3);
	System.out.println(t2==t3);
}
}
