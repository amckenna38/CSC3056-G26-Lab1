package tests;

import models.User;

public class UserTests {

	public static void main(String[] args) {
		
//		User testUser = new User("johndoe", "password123", "John", "Doe", "0771234567");
//		
//		System.out.println(testUser);
		
		String username_test = "johndoe";
		String password_test = "password123";
		String firstName_test = "John";
		String lastName_test = "Doe";
		String phoneNumber_test = "0771234567";
		
		User testUser = new User(username_test, password_test, firstName_test, lastName_test, phoneNumber_test);
		
		Boolean testPassed = true;
		
		if (testUser.getUsername() != username_test) {
			System.out.println("TC1 FAILED: Usernames did not match!");
			testPassed = false;
		}

		if (testUser.getPassword() != password_test) {
			System.out.println("TC2 FAILED: Passwords did not match!");
			testPassed = false;
		}
		
		if (testUser.getFirstName() != firstName_test) {
			System.out.println("TC3 FAILED: First Name did not match!");
			testPassed = false;
		}
		
		if (testUser.getLastName() != lastName_test) {
			System.out.println("TC4 FAILED: Last Name did not match!");
			testPassed = false;
		}
		
		if (testUser.getPhoneNumber() != phoneNumber_test) {
			System.out.println("TC5 FAILED: Phone Numbers did not match!");
			testPassed = false;
		}
		
		if (testPassed) {
			System.out.println("All TC's passed!");
		}
		
		assert testUser.getUsername() == username_test;
		assert testUser.getPassword() == password_test;
		assert testUser.getFirstName() == firstName_test;
		assert testUser.getLastName() == lastName_test;
		assert testUser.getPhoneNumber() == phoneNumber_test;
		
		System.out.println("All assertions in the test suite have passed successfully.");
	}

}
