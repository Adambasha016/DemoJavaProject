package org.Itpl.Diatoz;

public class Demo07 {
public static void main(String... adam) {
System.out.println("hello");	
int[] arr=new int[] {1,2,3,4,5,6,7,8};
int res=0;
for(int ele:arr) {
	res-=ele;
}
System.out.println(res);
}
}
