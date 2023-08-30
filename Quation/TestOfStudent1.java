package org.prctice.DSA.FAANGM.Quation;

public class TestOfStudent1 {
public static void main(String[] args) {
//	Student1 sam= new Student1();
	
	Student1 punith=new Student1(13, "punith", 89.92f);
//	System.out.println(sam.toString() ); 
//	System.out.println(punith.toString() );
	Student1 karuna=new Student1(punith);
//	System.out.println(karuna.toString());
	
	
	
	

//*********************************************

// finalize() called by gabeg collecter to remove  abondet object 
	for(int i=0;i<10000000;i++) {
		karuna=new Student1(punith);
	}



}
}