package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {
		
		System.out.println("Welcome to java core programming");

		Scanner power = new Scanner(System.in);

		System.out.println("Enter a number:");

		int Number = power.nextInt();

		System.out.println("Power of 2^" + Number + " is : " + (Math.pow(2, Number)));

		System.out.println();

		System.out.println("Printing all till Power Value " + Number);

		for (int i = 1; i <= Number; i++) {

			System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
		}

	}

}
