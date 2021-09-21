package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {

		System.out.println("Welcome to java core programming");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number ");

		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {

			while (num % i == 0) {

				System.out.println(i + " ");
				num = num / i;

			}

			if (num > 2) {

				System.out.print(num);
			}
		}

	}

}
