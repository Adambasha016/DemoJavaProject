package org.prctice.DSA.FAANGM.Quation;

public class Student1 {
	int rno;
	String name;
	float marks;
	// {
	//	 System.out.println("non static block");
	// }

	//  Student1(){
	//	 this.rno=12;
	//	 this.name="sam";
	//	 this.marks=87.84f;
	// }
	// this will replace with which object we calling the Studebnt1 for that it will assing the valuse
	//this is mandatory
	Student1(int rno,String name,float marks){
		this.rno=rno;
		this.name=name;
		this. marks=marks;
	}

	public Student1(Student1 other) {
		this.rno=other.rno;
		this.name=other.name;
		this.marks=other.marks;
	}


	@Override
	public String toString() {
		return "Student1 [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is destriyed");	// TODO Auto-generated method stub
		super.finalize();
	}

}
