package nonprimitivecasting;

class Father{
	String name = "Tom";
}

class Son extends Father{
	int age = 25;
}

class Solution {

	public static void main(String[] args) {
		//Upcasting
		Father f = new Son();
		System.out.println(f.name);

		//Downcasting
		Son s = (Son) f;
		System.out.println(s.name+" "+s.age);
	}  
}
