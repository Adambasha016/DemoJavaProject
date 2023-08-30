package org.basic.prg.code.repet.code;

public class NumberPatterns {
	public static void main(String[] args) {
		//		pattren1(5);
//		pattren2(5);
//		pattren3(5);
//		pattren4(5);
		pattren5(5);


	}



	public static void pattren1(int aq) {

		//	1
		//	12
		//	123
		//	1234
		//	12345        -----
		//	1234              |
		//	123              \/
		//	12
		//	1	
		for(int i=1;i<=aq;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=aq-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("**********************************");
		
	}
	public static void pattren5(int ax) {
		for(int i=1;i<=ax;i++) {
			for(int j=1;j<=ax-i+1;j++) {
				if(i>1&&j==1) {
					for(int h=i;h>=1;h--) {
						System.out.print(h);
					}
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	   void pattren4(int qw) {
		for(int i=1;i<=qw;i++) {
			for(int j=1;j<=qw;j++) {
				if(i>1&&i>=j) {
					System.out.print(i );
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		System.out.println("**********************************");
	}
	
	
	public static void pattren2(int q) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int u=i-1;u>=1;u--) {
				System.out.print(u+" ");
			}
			System.out.println();
		}
		System.out.println("**********************************");
	}
	public static void pattren3(int qq) {
      for(int a=1;a<=qq;a++) {
    	  for(int b=1;b<qq-a+1;b++) {
    		  System.out.print(" ");
    		  
    	  }
    	  for(int c=1;c<=a;c++) {
    		  System.out.print(c);
    	  }
    	  System.out.println();
      }
      for(int d=1;d<=5;d++) {
    	  for(int e=1;e<=d;e++) {
    		  System.out.print(" ");
    	  }
    	  for(int f=1;f<=qq-d;f++){
    		  System.out.print(f);
    	  }
    	  System.out.println();
      }


	}
	

      
   
	}

