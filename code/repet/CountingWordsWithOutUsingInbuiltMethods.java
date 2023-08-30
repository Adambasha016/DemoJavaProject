package org.basic.prg.code.repet.code.repet;
import java.util.Scanner;

public class CountingWordsWithOutUsingInbuiltMethods {
	public static void main(String[] args) {
		String s1=" java is easy language easy  java ";
		//countWords(s1);
		countWords1(s1);
	}
          	public static void countWords(String as) {
		Scanner sc= new Scanner(as);
		int count =0;
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		System.out.println(count);
	}
	public static void countWords1(String as) {
		int count=0;
		for(int j=1;j<as.length()-1;j++) {
			if(as.charAt(j-1)!=' '&&(as.charAt(j)==' '&&(as.charAt(j+1)!=' '||as.charAt(j+2)!=' '))) {
				count++;
			}
		}
		System.out.println(count+1);
	}
}
