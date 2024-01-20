package method;

class Netflix {
 static void login(String email,int password) {
	 System.out.println("Logged using email and password");
 }
 static void login(int contactNo,int password) {
	 System.out.println("Logged using contactNo and password");
 }
  public static void main(String[] args) {
	login(987654321,3232);
	login("dinga@guldu",1234);
	
}
}
