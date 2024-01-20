package ctp;


class Myntra{
	void buy(String name){
		System.out.println("Name:"+name);
	}
	void buy(int cost) {
		System.out.println("Cost:"+cost);
	}
	void buy(String name,int cost) {
		System.out.println("Nmae:"+name+" "+"Cost:"+cost);
	}
	void but(int cost, String name) {
		System.out.println("Cost:"+cost+" "+"Name:"+name);
	}
}


public class Solution {

	public static void main(String[] args) {
       Myntra m = new Myntra();
       m.buy("Watch");
       m.buy(4500);
       m.buy("Speaker",7500);
       m.but(8500,"Earphone");
	}

}
