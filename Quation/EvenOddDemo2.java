package org.prctice.DSA.FAANGM.Quation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddDemo2 implements Runnable {
//	Object as;?
	int count;
	public EvenOddDemo2(int cunt) {
		this.count=cunt;
//		this.as=a;
	}

	@Override
	public void run() {
		if(count%2==0) {
			System.out.println("theread name :   "+Thread.currentThread().getName()+"     value :"+count);
		}
		if(count%2!=0) {
			System.out.println("   therad name :  "+Thread.currentThread().getName()+"   value :"+count );
		}
	}


	//*********************&&&&&&&&&&&&&&&&&&&&&&&&&&&&&************************8
	public static void main(String[] args) {
//		Object a=new Object();
		ExecutorService ex=Executors.newFixedThreadPool(2);
		for(int i=1;i<=11;i++) {
			try {
				Thread.sleep(599);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			EvenOddDemo2 demo2 = new EvenOddDemo2(i);
			ex.execute(demo2);
			
//			if(i%2!=0) {
//			EvenOddDemo2 as=new EvenOddDemo2(i, "odd");
//			ex.execute(as);
//			}
//			else {
//			EvenOddDemo2 as=new EvenOddDemo2(i, "even");
//			ex.execute(as);
//		}
		}
		ex.shutdown();
	}











}
