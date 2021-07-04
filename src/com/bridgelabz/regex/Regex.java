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
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");//Regex sintax
		Matcher matcher = pattern.matcher(i);//Regex sintax

		boolean matchFound = matcher.matches();//Use for identification of correct or incorrect.
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


		boolean matchFound1 = matcher1.matches();
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

		boolean matchFound2 = matcher2.matches();
		if (matchFound2) {
			System.out.println("Email address is Correct");
		} else {
			System.out.println("Email address is Inorrect");
		}
		String l;
		Scanner Scan3 = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number :-");
		l = Scan3.next();
		Pattern pattern3 = Pattern.compile("^[7-9][0-9]{9}$");
		Matcher matcher3 = pattern3.matcher(l);

		boolean matchFound3 = matcher3.matches();
		if (matchFound3) {
			System.out.println("Mobile Number is Correct");
		} else {
			System.out.println("Mobile Number is Inorrect");
		}
		String m;
		Scanner Scan4 = new Scanner(System.in);
		System.out.println("Enter Your Password :-");
		m = Scan4.next();
		Pattern pattern4 = Pattern.compile("^[a-zA-Z0-9+_.@-]{8}+$");
		Matcher matcher4 = pattern4.matcher(m);

		boolean matchFound4 = matcher4.matches();
		if (matchFound4) {
			System.out.println("The password is Correct");
		} else {
			System.out.println("The password is Inorrect");
		}
		System.out.println();
	}
}
