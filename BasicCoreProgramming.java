package com.BasicProgramm;

import java.util.Scanner;

public class BasicCoreProgramming {

	public static void main(String[] args) {

		System.out.println("Welcome to java core programming");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Alphabet");

		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {

			System.out.println("Alphabet" + ch + " is an vowel");
		}

		else {

			System.out.println("Alphabet" + ch + " is a consonant");
		}

	}

}
