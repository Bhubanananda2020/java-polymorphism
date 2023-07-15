package com.bhubanananda.methodoverloading;

/**
 * The Class MethodOverloadingByNumberOfArguments.
 *
 * @author Bhubanananda
 */
public class MethodOverloadingByNumberOfArguments {

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
	 * @param width  the width
	 */
	void area(double length, double width) {
		System.out.println("rectangle area");
		System.out.println(length * width);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new MethodOverloadingByNumberOfArguments().area(5.0);
		new MethodOverloadingByNumberOfArguments().area(5.0, 4.0);
	}
}