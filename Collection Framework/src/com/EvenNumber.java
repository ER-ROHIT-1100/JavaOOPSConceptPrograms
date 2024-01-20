package com;

import java.util.ArrayList;

public class EvenNumber {


	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(1.5);
		l.add(null);
		l.add(30);
		l.add(40);
		l.add(15);
		l.add(16);
		l.add(24);
		l.add('a');
		l.add(45);
		
		int sum=0;
		for(Object obj: l) {
			if(obj instanceof Integer) {
				Integer k = (Integer)obj;	
			  if(k%2==0){
			System.out.println(k);
			  sum=sum+k;
		}
		}
		}
      System.out.println("Sum : "+sum);
	}
}
