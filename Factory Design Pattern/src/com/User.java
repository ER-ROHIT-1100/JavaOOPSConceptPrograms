package com;

class User {
	
	 OnlineShoppingApp selectApp(int choice){
		 OnlineShoppingApp o = null;
		 if(choice ==1) {
			 o=new Flipkart();
		 }else if(choice==2) {
			 o=new Myntra();
		 }
		 return o;
	}

}
