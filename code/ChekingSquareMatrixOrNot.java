package org.basic.prg.code.repet.code;

public class ChekingSquareMatrixOrNot {
public static void main(String[] args) {
	int ass[][]= {{1,0,0},
			      {0,1,0},
			      {0,0,1},
			    	  };
			    	  
			      
	isSquareMatrixOrNot(ass);
	
}
public static void isSquareMatrixOrNot(int as[][]) {
	boolean b=true;
	if(as.length!=as[0].length) {
		System.out.println("it is a not square matrix");
	}
	else {
		for(int j=0;j<as.length;j++) {
			for(int i=0;i<as.length;i++) {
				if(i==j&&as[i][j]!=1) { 
					b=false;
					break;
				}
				if(i!=j&&as[i][j]!=0) {
					b=false;
					break;
				}
			}
		}
		if(b) {
			System.out.println("giving matrix is ideal matix");
		}
		else {
			System.out.println("given matrix is not ideal matrix");
		}
	}
}
}
