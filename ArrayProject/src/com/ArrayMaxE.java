package com;

class ArrayMaxE {
	public static void main(String args[])
	  {

	     int a[] = {12, 13, 1, 10, 34, 10, 54, 63};

	     int max = a[0];

	     for(int i=0; i<a.length; i++)
	     {
	       if(max < a[i])
	       {
	          max = a[i];
	       }

	     }

	    System.out.print(max); 
	  }

}
