package com;

  @FunctionalInterface
 interface OnlineShoppingApp {
   void order();
}
   class Flipkart implements OnlineShoppingApp{
	 @Override
	public void order() {
		 System.out.println("Ordering From Flipkart");	 
	 }
 }
   class Myntra implements OnlineShoppingApp{
	   @Override
	  public void order() {
		   System.out.println("Ordering From Myntra");
	   }
   }
 