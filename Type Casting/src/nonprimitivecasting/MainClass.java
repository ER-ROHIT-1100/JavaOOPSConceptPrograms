package nonprimitivecasting;

class MainClass {

	public static void main(String[] args) {
		//Upcasting
         Vehicle v = new Bike ();
         System.out.println(v.brand+" "+v.color);
          
         System.out.println("-----------");
         
         //Downcasting
         Bike b = (Bike)v;
         System.out.println(b.brand+" "+b.color+" "+b.cost+" "+b.fuel);
         b.start();
         b.stop();
	}

}
