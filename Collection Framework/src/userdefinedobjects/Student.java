
package userdefinedobjects;


public class Student implements Comparable<Student>{
	int marks;
	
	Student(int marks){
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Marks: "+marks;
	}
	 @Override
	public  int compareTo(Student x) {
		return this.marks-x.marks;
	}

}
