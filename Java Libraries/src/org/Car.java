package org;

public class Car {
  int cost;
  String brand;
  
     Car(int cost, String brand){
    	 this.cost=cost;
    	 this.brand=brand;	   	 
     }
     @Override
     public boolean equals(Object obj) {
    	 Car c =(Car)obj;
    	 return this.brand==c.brand && this.cost==c.cost;
     }
     public static void main(String[] args) {
		Car c1= new Car(20000,"Bmw");
		Car c2 = new Car(20000,"Bmw");
		 System.out.println(c1.equals(c2));
		
		if(c1.equals(c2)){
			System.out.println("Cost and Brand is Same");
		}else {
			System.out.println("Cost and Brand is Different");
		}
		
	}
}
