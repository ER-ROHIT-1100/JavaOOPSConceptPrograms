package MultiLevel;

class MainClass {
	 public static void main(String[] args){
		  Department d = new Department();
		System.out.println("University Name:"+d.universityName);
		System.out.println("College Name:"+d.collegeName);
		System.out.println("Department Name:"+d.departmentName);

		System.out.println("--------");

		d.giveAssignment();
		d.conductInternals();
		d.conductExams();
		 }
		}
