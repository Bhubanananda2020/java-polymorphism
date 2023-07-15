/*
 * @ author Bhubanananda
 */
package com.bhubanananda.methodoverloading;

/**
 * The Class MethodOverloadingByDatatypeOfArguments.
 *
 * @author Bhubanananda
 */
public class MethodOverloadingByDatatypeOfArguments {

	/**
	 * Area.
	 *
	 * @param radius the radius
	 */
	void area(double radius) {
		System.out.println("circle area");
		System.out.println(radius * radius * 3.14);
	}

	/**
	 * Area.
	 *
	 * @param length the length
	 */
	void area(int length) {
		System.out.println("square area");
		System.out.println(length * length);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new MethodOverloadingByDatatypeOfArguments().area(5.0);
		new MethodOverloadingByDatatypeOfArguments().area(5);
	}
}