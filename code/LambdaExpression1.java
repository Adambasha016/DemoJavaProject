package org.basic.prg.code.repet.code;

import java.util.Scanner;

interface WSX{
	public void WW();
}


interface AS{
	public void m1(int z);
}
interface DEMO{
	public int m2(int a);
}
interface QAZ{
	public int sum(int a,int b);
}
interface EDC{
	public boolean isEvev(int a);
}
interface RFV{
	public boolean isPrime(int f);
}


public class LambdaExpression1 {
	public static void main(String[] args) {
		//		WSX s=()->System.out.println(" no ARgument method");
		//		s.WW();

		//	System.out.println("***************************************************************");

		//	AS v=(int a)->System.out.println(a);
		//         AS v=(n)->System.out.println(n+"hello AP");
		//	AS v=(int a)->{
		//		System.out.println("hello Ap");
		//	};
		//	v.m1(2);
		//      v.m1(2);
		//	System.out.println("***************************************************************");
		//	DEMO s=(n)->n*n;
		//	System.out.println(s.m2(3));
		//		DEMO s=n->{
		//			return n*n;
		//					
		//		};
		//		System.out.println(s.m2(39));
		//	System.out.println("***************************************************************");
		//	QAZ x=(a,b)->a+b;
		//	System.out.println(x.sum(30, 70));
		//		QAZ p=(int a,int v)->{
		//			int sum1=a+v;
		//			return sum1;
		//		};
		//			System.out.println(p.sum(40, 70));
		//		QAZ c=(a,b)->{
		//			return  a+b;
		//		};
		//		System.out.println(c.sum(20, 30));
		//	System.out.println("***************************************************************");

		//              EDC d=(n)->n%2==0;
		//            System.out.println(d.isEvev(7));
		//	System.out.println("***************************************************************");
		RFV v=(int f)->{
			if(f<2) {
				return false;
			}
			for(int i=2;i<f/2;i++) {
				if(f%i==0) {
					return false;
				}
			}
			return true;
		};
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter a number");
		int int1 = sc.nextInt();
		for(int j=2;j<int1;j++ ) {
			try {
				Thread.sleep(143);	
			}catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
			System.out.println("Is A Prime NUmber "+v.isPrime(j)+"  and the number is  "+j);
		}
	}


}

