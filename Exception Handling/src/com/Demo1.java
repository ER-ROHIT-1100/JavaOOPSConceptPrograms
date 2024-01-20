package com;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(10/0);
		
		int[] a = {10,20,30};
		System.out.println(a[99]);
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try{
			Thread.sleep(2000);		
		}catch(InterruptedException e) {
			e.printStackTrace();
	  }
    }
	//	try {
	//		FileReader f = new FileReader("car.txt");
	//	}catch(FileNotFoundException e) {
	//		System.out.println("File not Found");
	//	}
  }
}
