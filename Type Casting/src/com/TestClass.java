package com;


  class TestClass{
	  // Generalization
	  // 1.Father obj = new Son(); & 2.Father obj = new Daughter();
	  static void display(Father obj) {
		  if(obj instanceof Son) {
			  System.out.println("DownCasting to Son");
			  Son s =new Son();
			  System.out.println(s.x+" "+s.y);
		  }
		  else if(obj instanceof Daughter) {
			  System.out.println("DownCasting to Daughter");
			  Daughter d = new Daughter();
			  System.out.println(d.x+" "+d.z);
		  }
	  }
  
public static void main(String[] args) {
          display(new Son());		
          System.out.println("------");
          display(new Daughter());
	}

}
