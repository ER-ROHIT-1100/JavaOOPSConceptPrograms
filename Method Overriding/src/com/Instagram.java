package com;



class Instagram {

	public static void main(String[] args) {
		Instagram3 i3= new Instagram3();
		i3.upload();
		System.out.println("--------");
		i3.dm();
		System.out.println("-------");
		i3.reels();

	}

}
class Instagram1{
	void upload() {
		System.out.println("It supports Images");
	}
}
class Instagram2 extends Instagram1{
	void upload() {
		super.upload();
		System.out.println("It Supports Videos upto 1 min");
	}void dm(){
		System.out.println("It supports Text");
	}
}
 class Instagram3 extends Instagram2{
	 void upload() {
		 super.upload();
		 System.out.println("It supports video more than 1 min");
	 }void dm(){
		 super.dm();
		 System.out.println("It supports Images to Text");
	 }void reels(){
		 System.out.println("It Plays Reels");
	 }
 }
 