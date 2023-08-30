package org.prctice.DSA.FAANGM.Quation;

public class EvenOrOddPrintingUsing2Threads  implements Runnable{
	private int number;
	public EvenOrOddPrintingUsing2Threads(int num) {
		this.number=num;
	}

	@Override
	public void run() {

		if(number%2!=0) {
			System.out.println(Thread.currentThread().getName()+"   "+number);
//			try {
//				Thread.currentThread().wait(500);
//			} catch (InterruptedE  xception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}
		if(number%2==0) {
//			Thread.currentThread().notify();
			System.out.println(Thread.currentThread().getName()+"   "+number);
			

		}


	}

}
