package org.prctice.DSA.FAANGM.Quation;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddNumberTest {
	
	public static void main(String[] args) {
		
		ExecutorService ec=Executors.newFixedThreadPool(2);
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			EvenOrOddPrintingUsing2Threads e1=new EvenOrOddPrintingUsing2Threads(i);
//			new Thread(e1,"odd").start();
//			new Thread(e1,"odd").start();
			ec.execute(e1);
			
			
			
		}
	}
}
