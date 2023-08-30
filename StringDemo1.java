package org.practice.marathahalli.generalSocite;

public class StringDemo1 {
public static void main(String[] args) {
	String s1="xyz0%A1B^Cy2DuEF*3";
	String s3="";
	String s2="1ab$#100MAghGI^%C00%11";
 String string = s2.replaceAll("[a-z%$#@&*^]","");
 s3=string  ;
 System.out.println(s3);
}
	
} 
