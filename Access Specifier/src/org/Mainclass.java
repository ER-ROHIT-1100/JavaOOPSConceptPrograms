package org;

public class Mainclass {
	public static void main(String[] args) {
		Student1 s1 = new Student1(21,"Allu");
		Student1 s2 = new Student1(22,"Mallu");
		System.out.println(s1.age+" "+s1.name);
		System.out.println(s2.age+" "+s2.name);
	}
}
