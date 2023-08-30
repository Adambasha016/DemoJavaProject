package org.basic.prg.code.repet.code;

public class PrintMatrixZigZagForm {
public static void main(String[] args) {
	int [][]ah
	   = {{1,2,3,4},
	           {5,6,7,8},
	           {9,10,11,12},
	           {13,14,15,16}};
		for(int i=0;i<ah.length;i++) {
			if(i%2==0) {
				for(int j=0;j<ah[i].length;j++) {
					System.out.print(ah[i][j]+" 2222");
				}
			}
			else {
				for(int j=ah[i].length-1;j>=0;j--) {
					System.out.print(ah[i][j]);
				}
			}
		}
		}
	
}

