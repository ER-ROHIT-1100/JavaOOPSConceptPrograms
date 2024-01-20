package com;

@FunctionalInterface
interface Student {

	void study();

}
class Tom implements Student{
	@Override
	public  void study() {
		System.out.println("Studying Java");
	}
}

class Jack implements Student{
	@Override
	public void study() {
		System.out.println("Studying Python");
	}
}

/**
 * Types Of Interface :
 * ------------------
 * 1.Marker Interface : 
 * -Empty Interface, with no abstract methods.
 * -Example : <<Serializable>>
 * 
 * 2.Functional Interface :
 * - Only 1 abstract method.
 * - Example :<<Comparable>>
 * 
 */
