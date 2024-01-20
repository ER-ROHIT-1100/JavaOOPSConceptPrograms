package primitivecasting;

class Solution {

	public static void main(String[] args) {
		// widening -->smaller type to bigger
		int a = 15;
		double b = a;
		System.out.println(a+" "+b);

		double c = 27;
		System.out.println(c);

		char i = 'A';
		int j = (int) i;
		System.out.println(i+" "+j);

		//Narrowing --> bigger type to smaller

		double x= 34.56;
		int y = (int) x;
		System.out.println(y);

		int z =(int) 45.34;
        System.out.println(z);
        
        int d = 99;
        char v  = (char) d;
        System.out.println(d+" "+v);
        
        System.out.println((int)12.35);
        System.out.println((char)65);
        System.out.println("A"+"B");
        System.out.println("A"+10);
        System.out.println("A"+"B");
        System.out.println("A"+10+20);
        System.out.println(10+20+"A");
        System.out.println('A'+'B');
        System.out.println('a'+20);
	}

}
