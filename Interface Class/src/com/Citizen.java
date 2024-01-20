package com;

 class Citizen implements State {
     @Override
     public void electPm() {
    	 System.out.println("PM Elect");
     }
     @Override
     public void electCm() {
    	 System.out.println("CM Elect");
     }
     
     public static void main(String[] args) {
		Citizen c = new Citizen();
		c.electPm();
		c.electCm();
	}
}
