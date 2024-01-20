package org;

 class Employe {
	 double salary;

	Employe(double salary){
		this.salary=salary;  
		}
	   @Override 
	   public boolean equals (Object obj) { // Object obj = new Employe(2.5);
		   Employe e = (Employe)obj;  // Downcasting
		   return this.salary==e.salary;  // e1.salary ==e2.salary;  -->2.5==2.5		   
	   }
	public static void main(String[] args) {
		Employe e1 = new Employe(20);
		Employe e2=new Employe(20);
		System.out.println(e1.equals(e2)); // e1.equals(new Employe(2.5));
	}
}
// e1 -> this  & e2 -> obj -> emp
