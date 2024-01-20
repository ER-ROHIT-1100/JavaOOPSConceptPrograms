package customexception;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		int password = sc.nextInt();
		sc.close();

		if(password==123) {
			System.out.println("Login Successful!");
		}
		else {
			try {
				throw new InvalidpasswordException("Invalid Password");
			}catch(InvalidpasswordException e) {
				System.out.println(e.getMessage());
	  }
	}
  }
}
