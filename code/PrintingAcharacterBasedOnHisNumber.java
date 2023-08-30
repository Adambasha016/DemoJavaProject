package org.basic.prg.code.repet.code;

public class PrintingAcharacterBasedOnHisNumber {
	public static void main(String[] args) {
		
	
String asd="a2b3c1d4";
for(int i=0;i<asd.length()-1;i=i+2) {
	char az = asd.charAt(i+1);
	if(az>='0'&&az<='9') {
		int count=az-'0';
		for(int j=0;j<count;j++) {
			System.out.print(asd.charAt(i)+"");
		}
		System.out.println();
		
	}






     }


}
}
