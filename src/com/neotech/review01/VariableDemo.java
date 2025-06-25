package com.neotech.review01;

// ALWAYS FORMAT YOUR CODE
// WINDOWS: ctrl + shift +f
// MAC: command + shift +f




//test1
public class VariableDemo {

	public static void main(String[] args) {

	
		// Declare a variable
		
		String firstName;
		
		//System.out.println("My name is -->" + firstName);

		// assign a value (initialize)
		firstName = "Gulay";

		System.out.println("My name is --> " + firstName);

		// Declare a variable & Assign a value
		String lastName = "Yalcin";
		
		int age = 37;
		
		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));
		
		// after 3 years
		// re-assign a new value to the container
		age = age + 3; // age += 3 ---> shorthand operator
		lastName = "Pitt"; 
		
		System.out.println(firstName + " " + lastName + " " + age);


		
	}

}
