package com;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
	   
	    ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(1.5);
        l.add(20);
        l.add(null);
        l.add("Java");
        
        
        System.out.println(l);
        System.out.println(l.get(1));
        System.out.println(l.size());
        System.out.println(l.contains("java"));
        System.out.println("========");
        System.out.println(l);
        l.remove(l);
        System.out.println("========");
        System.out.println(l);
        System.out.println("========");
        l.clear();
        System.out.println(l.isEmpty());
        
	}
}
