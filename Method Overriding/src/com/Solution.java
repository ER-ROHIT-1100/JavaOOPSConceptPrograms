package com;

class Employee{
	void work() {
		System.out.println("Working");		
	}
}
class Developer extends Employee{
	@Override
	void work() {
		System.out.println("Devloping App");
	}
}
class Tester extends Employee{
	@Override
	void work() {
		System.out.println("Testing App");
	}
}
class Solution {

	public static void main(String[] args) {
		Developer d = new Developer();
		d.work();

		System.out.println("----------");

		Tester t = new Tester();
		t.work();

	}

}
