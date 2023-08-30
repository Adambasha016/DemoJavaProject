package org.practice.marathahalli.generalSocite;

import java.util.Arrays;

public class Varargs {
public static void main(String[] args) {
	muitiplr(20, 32, "smith","alen","king");
}
static void muitiplr(int a,int b,String ...s) {
	System.out.println(a+""+b);
	System.out.println(Arrays.toString(s ));
}
}
