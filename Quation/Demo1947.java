package org.prctice.DSA.FAANGM.Quation;

public class Demo1947 {
	public static void main(String[] args) {
		String s1="i am in bengaluru adam";
		//out put "1i a2m i2n beng9aluru;
		String string="";
		String[] split = s1.split(" ");
		for(int i=0;i<split.length;i++) {
			//			System.out.println(ans);
			int findthelength = findthelength(split[i]);
			int index = findindexValue(findthelength);
			string += mergeString(split[i], findthelength, index);

			//			for(int j=0;j<split[i].length();j++) {
			//				if(j==index) {
			//					System.out.println(j);
			//					ans+=findthelength;
			//					ans+=split[j];
			//				}
			//				else {
			//					ans+=split[j];
			//				}
			//			}
			if(i<split.length) {
				string+=" ";
			}
			//
		}

		System.out.println(string.toUpperCase().toString());



	}
	public static int findindexValue(int n) {
		return n/2;
	}

	public static int findthelength(String as) {

		int cout=0;
		for(int i=0;i<as.length();i++) {
			cout++;
		}
		//		int i = as.length();
		return cout;
	}
	public static String mergeString(String as,int len,int index) {
		String ans="";

		for(int i=0;i<as.length();i++) {
			if(i==index) {
				ans+=len;
				ans+=as.charAt(i);
			}
			else {
				ans+=as.charAt(i);
			}
		}
		//		System.out.println(as);
		return ans;
	}


}
