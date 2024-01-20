package method;

class Person {
	void display(int age) {
		System.out.println("Age:"+age);
	}
	void display(String name) {
		System.out.println("Name:"+name);
	}
  void display(String name,int age) {
	  System.out.println("Name:"+name+" "+"Age:"+age);
	  }
  void display(int age,String name) {
	  System.out.println("Age:"+age+" "+"Name:"+name);
  }
   public static void main(String[] args) {
	   Person p = new Person();
	   p.display(25);
	   p.display("Rakshith");
	   p.display("Rakshith" , 25);
	   p.display(25 , "Rakshith");
   
  }
}
