package org.Itpl.Diatoz;

import java.util.Arrays;

public class Demo08 {
public static void main(String[] args) {
	int size=3;
	Student[] st=new Student[size];
	for(int i=0;i<size;i++) {
		st[i]=new Student();
       st[i].id=i;
       st[i].name="name"+i;
	}
	//System.out.println(Arrays.toString(st));
//	for(int i=0;i<size;i++) {
//		System.out.println(st[i]);
//		System.out.println(st[i].id+""+st[i].name);
//	}
//	
	st[2]=st[0];
st[0].id=1;
st[0].name="hanzo";
//System.out.println(st[2]==st[0]);
System.out.println(st[2].id+"  "+st[2].name);
}
public static class Student{
	public int id;
	public String name;
}
}

