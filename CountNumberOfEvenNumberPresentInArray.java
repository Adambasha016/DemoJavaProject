package org.practice.marathahalli.generalSocite;

public class CountNumberOfEvenNumberPresentInArray {
public static void main(String[] args) {

	int []ad= {12,345,2,6,-7869,987654};
System.out.println(findNumber(ad));


}
static int findNumber(int []as) {
	int count=0;
	for(int num:as) {
		if(even(num)) {
			count++;
		}
	}
	return count;
}


static boolean even(int num) {
	int digit=digit2(num);
	return digit %2 ==0;
} 



  static int digit(int num) {
	  
	  // this is used to conver negative number to positive number  by multiplaying -1 to negative number
	  if(num<0) {
		  num=num*-1;
  }
	  if(num==0) {
		  return 1;
	  }
	  int count=0;
	  while(num>0) {
		count++;
		num/=10;
		   
		  
	  }
	  return count;
	  
}
  // optimisd method 
  static int digit2(int num) {
	  
	  if(num<0) {
		  num=num*-1;
  }
	  return (int)(Math.log10(num))+1;
  }
  
  
}