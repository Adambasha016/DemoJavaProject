package org.basic.prg.code.repet.code;
interface AB{
	public void maaa() ;
}
public class LambdaExpression {
public static void main(String[] args) {
	AB t=()->{
		System.out.println("maaa()method");
	};
	t.maaa();
}
}
