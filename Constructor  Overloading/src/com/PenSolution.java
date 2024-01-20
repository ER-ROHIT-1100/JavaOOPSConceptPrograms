

package com;

class PenSolution {

	public static void main(String[] args) {
	Pen p1 =new Pen("Marker",50);
    Pen p2 =new Pen("Trimax",70);
	
	Pen[] p ={p1,p2};
	for (int i=0; i<p.length; i++)
	{
		System.out.println("Cost of"+ p[i].brand+"pen is Rs"+ p[i].cost);
	}
}

} class Pen{
	String brand;
	int cost;
	 
	Pen(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
  }
 