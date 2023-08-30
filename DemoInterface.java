package org.practice.marathahalli.generalSocite;
interface Animal{
	void makeSound();
}
class Dog  implements Animal{

	@Override
	public void makeSound() {                                                               
System.out.println("BOW BOW BOWWW ");	                                     	
	}                                                         
                                             	
  }                   
 public class DemoInterface {                                            
public static void main(String[] args)  {                                                   
	Object o=new Object();                                                          
	Animal a=(Animal) o;                                              
//	a.makeSound();
 	Dog c= (Dog) o;
 	c.makeSound();                                                            
 	if(o instanceof Animal) {                                          
                    		((Animal)o).makeSound();                            
      		Animal a1=(Animal) o;                               
	}
 }
}
                                    