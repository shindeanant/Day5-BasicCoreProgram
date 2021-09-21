package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {
		System.out.println("Welcome to java core programming");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any calender year");

		int leapyear = sc.nextInt();

		if (leapyear % 4 == 0 && leapyear % 100 != 0 || leapyear % 400 == 0) {

			System.out.println("This is leap year");

		} else {

			System.out.println("This is  not leap year");
		}

	}

}
