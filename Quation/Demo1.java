package org.prctice.DSA.FAANGM.Quation;
import java.util.Scanner;  
public class Demo1 { 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number between 1 to 10");
		try {
			int num = sc.nextInt();
			if(num>0||num<10) {
				throw new InvalidNumberException("not a valid number1");
			}
		}catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
