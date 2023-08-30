package org.practice.DSA.FAANG.recursion;

//import com.sun.jndi.url.rmi.rmiURLContext;

public class Nto1 {
	public static void main(String[] args) {

		//		fun(5);

		//		System.out.println(factorial(5));
//				System.out.println(sumOfANmber(5));
//				System.out.println(sumOfDigit(1234));
				System.out.println(product(55));
		//		reverANumber(1234);    
		//		System.out.println(sum);
		//		 System.out.println(reverANumber1(1234));  
		//		System.out.println(palin(1234321));  
		//		System.out.println(countZeros(20304));
//		System.out.println(countZeros1(20304009));


	}





	//************************

	public static boolean palin(int m) {
		return m == reverANumber1(m);
	}
	//*************************&&&&&&&&&&&&&^^^^^^^^^^^^^^^^^^^^^^^^^
	//count how maney 0 in number    30204   ------>2 zeros avalible

	public static int countZeros1(int b) {
		if(b==0) {
			return 0;
		}
		int rem=b%10;
		if(rem==0) {
			return countZeros1(b/10)+1;
		}
		return countZeros1(b/10);
	}


	public static int countZeros(int b) {
		return helper(b, 0);
	}
	public static int helper1(int b,int c) {
		if(b==0) {
			return c;
		}
		int rem=b%10;
		if(rem==0) {
			return	helper1(b/10, c+1);
		}
		return helper1(b/10, c);		
	}





	//********************&&&&&&&&&&&&******************
	public static int product(int m) {
		if(m%10==m) {
			return m;
		} 
		return product(m/10)*(m%10);    	

	}
	//**********&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&************************
	static int  sum;
	public static void reverANumber(int a) {
		if(a==0) {
			return ;
		}
		int rem=a%10;
		sum=sum*10+rem;
		reverANumber(a/10);

	}

	//********************************************************
	// sometimes you might need some additional variables in the argument in thaat caase,make another f untion
	public static int reverANumber1(int a) {
		int digit=(int)Math.log10(a)+1;
		return helper(a,digit);

	}


	public  static int  helper(int a, int digit) {
		if(a%10==a) {
			return a;
		}
		int rem=a%10;

		return rem*(int)Math.pow(10, digit-1)+helper(a/10, digit-1);
	}
 
	//********************************************

	public static int sumOfDigit(int m) {
		if(m==0) {
			return 0;
		} 
		return sumOfDigit(m/10)+m%10;    	

	}
	//***********************************
	public static int  factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	//******************************************



	public static int  sumOfANmber(int n) {
		if(n<=1) {
			return 1;
		}
		return n+sumOfANmber(n-1);
	}



	//*********************************************
	public static void fun(int m) {
		if(m==0) {
			return;
		}

		System.out.println(m);  // 5 4 3  2 1
		fun(m-1);
		//		System.out.println(m);   //1 2 3 4 5
	}

}


