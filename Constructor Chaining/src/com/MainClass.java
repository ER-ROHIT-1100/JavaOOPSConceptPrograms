package com;

class Aan
{
	Aan(int x){
		this(1.5);
		System.out.println(1);
	}
	Aan(double x){
		System.out.println(2); 
	}
}
class Ban extends Aan {
	Ban(String x){
		super(50);
		System.out.println(3);
	}
	Ban(int x){
		this("hii");
		System.out.println(4);
	}
}
public  class MainClass{
	public static void main(String[] args) {
		System.out.println("Start");
		Ban b =  new Ban(10);
		System.out.println("End");

	}

}
