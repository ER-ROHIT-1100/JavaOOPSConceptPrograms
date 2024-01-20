package com;

public class Gadgets {

}
class Laptop extends Gadgets{
	@Override
	public String toString() {
		return "Ordered Laptop";
	}
	
}
class Mobile extends Gadgets{
	@Override
	public String toString() {
		return "Ordered Mobile";
	}
}
class Watch extends Gadgets{
	@Override
	public String toString() {
		return "Ordered Watch";
	}
}