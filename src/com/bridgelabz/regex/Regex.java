package com.bridgelabz.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	Scanner SC = new Scanner(System.in);

	boolean First() {
		String i;
		System.out.println("Enter Your First Name :-");
		i = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");// Regex sintax
		Matcher matcher = pattern.matcher(i);// Regex sintax

		boolean matchFound = matcher.matches();// Use for identification of correct or incorrect.
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
		return matchFound;
	}

	boolean Last() {
		String j;
		System.out.println("Enter Your Last Name :-");
		j = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher = pattern.matcher(j);
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
		return matchFound;
	}
}
