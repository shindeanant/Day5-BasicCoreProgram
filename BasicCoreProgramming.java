package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {
		System.out.println("Welcome to java core programming");

		int Heads = 0;
		int Tails = 0;
		int Counter = 1;

		double randNum = 0.0;

		double percentage_Heads;

		Scanner Input = new Scanner(System.in);

		System.out.println("The Numbres of times to filp coin ");

		double flips = Input.nextDouble();

		while (Counter <= flips) {

			randNum = Math.random();

			System.out.print(Counter + " " + randNum);

			if (randNum < 0.5) {
				Heads++;
				System.out.println(" heads ");

			}

			else {
				Tails++;
				System.out.println(" tails ");
			}

			Counter++;
		}

		System.out.println();

		System.out.println("Number of Heads = " + Heads);
		System.out.println("Number of Tails = " + Tails);

		percentage_Heads = ((Heads / flips) * 100);

		System.out.println("Percentage of Heads :" + percentage_Heads);

		double percentage_Tails = ((Tails / flips) * 100);

		System.out.println("Percentage of Heads :" + percentage_Tails);

	}

}
