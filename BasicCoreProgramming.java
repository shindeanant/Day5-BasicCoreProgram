package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {

		System.out.println("Welcome to java core programming");

		double sum = 0.0;
		double a = 1.0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		double Number = sc.nextDouble();

		for (double i = 1; i <= Number; i++) {

			sum += a / i;

		}

		System.out.println("Harmonic value is:" + sum);

	}

}
