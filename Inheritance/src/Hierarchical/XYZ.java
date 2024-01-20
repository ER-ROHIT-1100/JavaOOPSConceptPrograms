package Hierarchical;

class XYZ  {

	public static void main(String[] args) {
	Car	c = new Car();
	System.out.println(c.brand +" "+c.color);
	c.start();
	
	 Bike b = new Bike();
	System.out.println(b.brand+" "+b.bikename);
         b.fastDrive();
	}

}
