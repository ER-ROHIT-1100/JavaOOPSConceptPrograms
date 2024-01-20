package org;

public class MainClass {
  public static void main(String[] args) {
	Employe e1 = new Employe(2.5);
	Employe e2 = new Employe(2.5);
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(new Employe(2.5)));
	
	if(e1.equals(e2)) {
		System.out.println("Salary is same");
	}	else {
		System.out.println("Salary is Different");	
	}
}
}
