package org.basic.prg.code.repet.code;
 // go for arrange2() and order2() and byusingCollection methods 
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrangingTheOrderInArray {
	public static void main(String[] args) {
//		int a[]= {2,4,-2,3,-6,-8,9,7,-4};
		int a[]= {2,5,-2,3,-6,-8,9,7,-4,4,-5};
		//	Arrays.sort(a);
			System.out.println(Arrays.toString(a));
//		int[] orde = arrrngeOrde(a);
//		System.out.println(Arrays.toString(orde));
		//		
		//			properOrder(orde);
		//			order22(orde);
		//System.out.println(Arrays.toString(orde));



		int[] is = arrange2(a);
		//	  System.out.println(Arrays.toString(is));	
		//	  properOrder(is);
		order22(is);
		System.out.println(Arrays.toString(is));	

//		byusingCollection(a);
	
	
	}

	public static int[] arrrngeOrde(int []a) {
		int []result=new int [a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				result[k]=a[i];
				k++;
			}
		}
		//		int a[]= {2,4,-2,3,-6,-8,9,7,-4};
		for(int j=0;j<a.length;j++) {
			if(a[j]>0) {
				int add=0;
				for(int i=0;i<a.length;i++) {
					if(a[j]>a[i]&&a[i]>0&&add==a[i]) {
						add=a[i];
						a[i]=0;
					}

				}
				if(add!=0) {
					result[k++]=add;

				} 
				else {
					result[k++]=a[j];
				}
			}
		}
		//		for(int i=0;i<a.leng th;i++) {
		//			if(a[i]>0) {
		//				result[k]=a[i];
		//				
		//			}
		//		}
		//		System.out.println(Arrays.toString(result));
		return result;
		//      System.out.println("888888888888888888888888888888888888888");
	}

	public static int[] arrange2(int []as) {
		int asd[]=new int[as.length];
		int k=0;
		for(int i=0;i<as.length;i++) {
			if(as[i]<0) {
				asd[k++]=as[i];
				as[i]=0;			
			}
		}
		for(int i=0;i<as.length;i++) {
			if(as[i]!=0) {

				asd[k++]=as[i];
			}
		}
		return asd;
		//	System.out.println(Arrays.toString(asd));
	}

	public static void properOrder(int []p) {

		int i=0;
		int j=p.length/2;
		while(i<j) {
			if(p[i]>p[j]) {
				int temp=p[j];
				p[j]=p[i];
				p[i]=temp;
			}
			i++;
			j--;
		}
		int g=p.length/2;
		int h=p.length-1;
		while(g<h) {
			if(p[g]>p[h]) {
				int temp=p[h];
				p[h]=p[g];
				p[g]=temp;
			}
			g++;
			h--;
		}

		int [] po=new int[p.length/2];
		System.out.println(po.length+"    "+p.length);
		int [] ne=new int[p.length-po.length];
		System.out.println(ne.length);
		//		int res[]=
		for(int k=0;k<p.length;k++) {

		}
	}

 	public static void order22(int qw[]) {
		int count=0;
		for(int i=0;i<qw.length;i++) {
			if(qw[i]<0) {
				count++;
			}
		}
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++){
				if(qw[i]>qw[j]) { 
					int temp=qw[j];
					qw[j]=qw[i];
					qw[i]=temp;
				}
			}
		}
		for(int i=count;i<qw.length-1;i++) {
			for(int j=i+1;j<qw.length;j++) {
				if(qw[i]>qw[j]) {
					int temp=qw[j];
					qw[j]=qw[i];
					qw[i]=temp;
				}
			}
		}





	}

public static void byusingCollection(int []qa) {
	Set<Integer> a=new TreeSet<>();
	for(int i=0;i<qa.length;i++) {
		a.add(qa[i]);
	}
	System.out.println(a);
}
	
}
