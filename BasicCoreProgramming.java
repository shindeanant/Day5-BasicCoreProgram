package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {

		System.out.println("Welcome to java core programming");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int number = sc.nextInt();

		if (number % 2 == 0) {

			System.out.println("The entered number is even");

		} else {
			System.out.println("The entered number is odd");
		}

	}

}
