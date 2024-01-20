package com;

class ArrayEven {
 public static void main(String[] args) {
	int[] a = {4,6,7,9,14,28,15,27};
	
	for (int i=0; i<=a.length; i++) {
		if(a[i]%2==0)
			System.out.println(a[i] +"Even Number");
		}
				
   }
}
