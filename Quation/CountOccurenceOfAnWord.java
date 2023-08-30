package org.prctice.DSA.FAANGM.Quation;

import java.util.Arrays;

public class CountOccurenceOfAnWord {
	
	public static void main(String[] args) {

		//		count1();  //method for counting the occuece 

		//		String as="java is oop lange java is plat indi java is a general purpose progamming language,"
		//				+ "java is used to build wide a nge og spplication java is strtely typed programming language,"
		//				+ "java supports multithreading lanunge,"
		//				+ "java we can write a code ones and excute any whrere";
		String as="java is oop lange java is plat indi java is a general purpose progamming language java is used to build wide a nge og spplication java is strtely typed programming language java supports multithreading lanunge java we can write a code ones and excute any whrere";

		//		count2(as, "java");
		//		occurenceofAChar("banana");
//		occurenceofAChar2("aaabbccddaabbss");
//		pallandrome("Malayalam");
		reveseString("java");



	}


	//***********************************************************************
	public static void count1() {
		String as="java is oop lange.java is plat indi.java is a general purpose progamming language,java is used to build wide a nge og spplication.java is strtely typed programming language,java supports multithreading lanunge,java we can write a code ones and excute any whrere";
		as = as.toLowerCase();
		int n=	as.length()-as.replace("java", "").length();
		n=n/"java".length();
		System.out.println(n);
	}
	//*************************************************************************************

	public static void count2(String az,String word) {
		String[] split = az.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++) {
			if(word.equals(split[i])){
				count++;
			}
		}
		System.out.println(count);
	}
	//**************************************************************************************************************
	public static void occurenceofAChar(String as) {
		while(as.length()>0) {
			char at = as.charAt(0);
			String string = as.replace(at+"", "");
			int n=as.length()-string.length();
			System.out.println(at+"  "+n);
			as=string;
		}
	}
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	public static void occurenceofAChar2(String as) {
		char[] cs = as.toCharArray();
		String s="";
		int i=0;
		while(i<cs.length) {
			char c=cs[i];
			int count=1;
			while(true) {
				i++;
				if(i<cs.length&&cs[i]==c)count++;
				else break;
			}
			s+=count+""+c;
		}
		System.out.println(s);

	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&&****************************************
	public static void pallandrome(String as) {
		char[] array = as.toLowerCase().toCharArray();
		int i=0,j=array.length-1;
		boolean flag=true;
		 while(i<j) {
			if(array[i]!=array[j]) {
				 flag=false;
//				 System.out.println("not an pallindrome");
//				return ;
			}
		
			i++;
			j--;
		}
		 if(flag)System.out.println("it is a pallindrome");
		 else System.out.println("not  a pallindrome");
	}
	
	//$$$$$$$$$$$$$$$$$$$$#####################################^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*****************************8888
	public static void reveseString(String az) {
		char[] as = az.toCharArray();
		int i=0,j=as.length-1;
		while(i<j) {
			char temp=as[i];
			as[i]=as[j];
			as[j]=temp;
			i++;
			j--;
					
		}
		System.out.println(Arrays.toString(as));
		String string = new String(as);
		System.out.println(string);
		
	}
	
}
