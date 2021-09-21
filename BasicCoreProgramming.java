package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {

		System.out.println("Welcome to java core programming");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two numbers:");

		System.out.println("Enter First number:");

		int num1 = sc.nextInt();

		System.out.println("Enter Second number:");

		int num2 = sc.nextInt();

		int swap = num1;

		num1 = num2;

		num2 = swap;

		System.out.println(" After swaping number is  : ");

		System.out.println("First number : " + num1);

		System.out.println(" second number:" + num2);

	}

}
