package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {

		String i;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Your First Name :-");
		i = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher = pattern.matcher(i);
		
		String j;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Last Name :-");
		j = Scan.next();
		Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher1 = pattern1.matcher(j);
		
//		System.out.println(i);
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
	}
}
