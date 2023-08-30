package org.prctice.DSA.FAANGM.Quation;

public class EvenOrOddByDemo1  implements Runnable{
	static int count=1;
	Object obj;
	public EvenOrOddByDemo1(Object o) {
		this.obj=o;
	}
	@Override
	public void run() {
		while(count<=10) {
			if(count%2==0&&Thread.currentThread().getName().equals("even")) {
				synchronized (obj) {

					System.out.println("Thread name "+Thread.currentThread().getName()+"value: "+count);
					count++;
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(count%2!=0&&Thread.currentThread().getName().equals("odd")) {
				synchronized (obj) {
					System.out.println("Thread name "+Thread.currentThread().getName()+"value:  "+count);
					count++;
					obj.notify();
				}

			}



		}

	}

	//*********************************************************************************

	public static void main(String[] args) {
		Object o=new Object();
		EvenOrOddByDemo1 e=new EvenOrOddByDemo1(o);
		EvenOrOddByDemo1 e1=new EvenOrOddByDemo1(o);
		new Thread(e,"even").start();
		new Thread(e1,"odd").start();
	}




}
