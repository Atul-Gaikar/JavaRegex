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

		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}

		String j;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Last Name :-");
		j = Scan.next();
		Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher1 = pattern1.matcher(j);

//		System.out.println(i);
		boolean matchFound1 = matcher1.find();
		if (matchFound1) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
		String k;
		Scanner Scan2 = new Scanner(System.in);
		System.out.println("Enter Your Email ID :-");
		k = Scan2.next();
		Pattern pattern2 = Pattern.compile("^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher2 = pattern2.matcher(k);

		boolean matchFound2 = matcher2.find();
		if (matchFound2) {
			System.out.println("Email address is Correct");
		} else {
			System.out.println("Email address is Inorrect");
		}
	}
}
