package customexception;

import java.util.Scanner;

public class Amazon {
       
	static void checkEligibilty (int percentage) throws InvalidPercentageException {
		if(percentage > 60) {
			System.out.println("Apply for Interview:");
		}else {
			throw  new InvalidPercentageException("Not Eligible for Amazon");
	}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage: ");
		int percentage =sc.nextInt();
		try {
		 checkEligibilty(percentage);		
      }catch(InvalidPercentageException e) {
	   System.out.println(e.getMessage());
   }
 }
}	
