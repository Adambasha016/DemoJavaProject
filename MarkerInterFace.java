package org.practice.marathahalli.generalSocite;
interface Washable{
	
}
class car implements Washable{
	
}
class Tv{
	
}
class Washer{
	void wash(Object c) {
		if(c instanceof Washable) {
			System.out.println("object is washed");
		}
		else {
			System.out.println("warning object not washable");
			System.out.println(c.getClass());
		}
	}
}
public class MarkerInterFace {
public static void main(String[] args) {
	Washer a= new Washer();
//	a.wash(new car());
	a.wash(new Tv());
}
}
