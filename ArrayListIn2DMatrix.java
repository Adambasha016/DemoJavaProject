package org.practice.marathahalli.generalSocite;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIn2DMatrix {
	public static void main(String[] args) {
		Scanner cc= new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		System.out.println("enter an element");
		for(int j=0;j<list.size();j++) {
			for(int i=0;i<3;i++) {
				list.get(j).add(cc.nextInt());

			}
		}
		System.out.println(list);
		
		
	}
}
