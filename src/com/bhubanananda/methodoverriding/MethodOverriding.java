package com.bhubanananda.methodoverriding;

/**
 * The Class MethodOverriding.
 *
 * @author Bhubanananda
 */
public class MethodOverriding {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bike().run();
	}

}

class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		System.out.println("Bike is running safely");
	}
}