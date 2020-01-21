package org.emp;

public class Employeee {
	public void empId(String s){
		System.out.println("email" +s);
	}

public void empId(int i){
	System.out.println("emp roll no" +i);
}
public void empId(long l){
	System.out.println("emp mob no" +l);

}
public static void main(String[] args){
	Employeee e=new Employeee ();
	e.empId(6789);
	e.empId(6877879);
	e.empId("fjhh@789");

}
}
