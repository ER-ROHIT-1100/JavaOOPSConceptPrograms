package com;

 class Employe {
	 String name;
	 double salary;
	 
	 Employe(String name, double salary){
		 this.name=name;
		 this.salary=salary;
	 }
 }
class TestSolution {
       
	static void findHighestSalary(Employe e1,Employe e2,Employe e3){
		if(e2.salary>e1.salary) {
			System.out.println(e2.salary+" is Hihghest of Salary");
			}
		else if(e3.salary>e1.salary) {
			System.out.println(e3.salary+" is Highest of Salary");
			}
		else
			System.out.println(e1.salary+" is Highest of Salary");
	}

	public static void main(String[] args) {
		Employe e1 = new Employe("Tom",25650);
		Employe e2 = new Employe("Jerry",29850);
		Employe e3 = new Employe("Monty",28750);
		findHighestSalary(e1,e2,e3);
	}

}
