package org.basic.prg.code.repet.code.repet;

public class CountingNumberOfLinesInAParagraph {
public static void main(String[] args) {
	String s1=" In addition to. senior-level developers.major software initiatives. also require large. numbers of junior con";
int count=0;
//
int iniallength=0;
String Final="";
int start=0;
 for(int i=0;i<s1.length();i++) {
	 int length=0;
	 String s2="";
	 if(s1.charAt(i)=='.'||i==s1.length()-1) {
		 count++;
		 for(int j=start;j<i;j++) {
			 if(s1.charAt(j)!='.'&&s1.charAt(j)!=' ') {
			 length++; 
			s2=s2+s1.charAt(j);
			 }
		 }
		 start=i;
		 if(length> iniallength) {
			 Final=s2;
			 iniallength=length;
		 }
	 }
 }
 System.out.println(count +"  "+ iniallength);
 System.out.println(Final);
}
}
