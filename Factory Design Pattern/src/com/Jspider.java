package com;

class Jspider {

	Student display(int choice) {
		Student s = null;
		if(choice==1) {
			s= new Tom();
		}
		else if(choice==2) {
			s= new Jack();
		}
		return s;
	}

}
