package com;

class Laptop {
	  String brand;
	  int cost;
	  Laptop(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	  }
	public static void main(String[] args) {
		Laptop l1= new Laptop("Lenovo",70000);
        Laptop l2=new Laptop("HP",60000);
        System.out.println("Cost of "+l1.brand+ "is Rs: "+l1.cost);
        System.out.println("Cost of "+l2.brand+ "is Rs: "+l2.cost);
	 }
	}
	 
	
	 
	

