package com;

public class ForEnhancedForLoopDemo {

	public static void main(String[] args) {

		int[] a = {10,20,30};

		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");

		for( int i:a) {
			System.out.println(i);  	
		}
		System.out.println("========");

		double[] marks = {78.25,48.24,92.21};

		for(double x : marks) {
			System.out.println(x);
		}
		System.out.println("-----------");

		String[] fruits = {"Apple","Mango","Banana"};
		for(String s : fruits) {
			System.out.println(s);
		}
	}
}
