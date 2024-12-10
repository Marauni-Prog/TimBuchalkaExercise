package Strings;

import java.util.Scanner;

public class String_manipulation {
	public static void main(String[] args) {
//		REPLACING AND SPLITTING STRINGS. 
//		USE THE REPLACE() METHOD OR THE REPLACEALL() METHODS.
//		NOTE THAT A NEW STRING IS CREATED AND ASIGNED THE VALUE OF THE OLD STRING.

		String s = "WELCOME TO JAVA PROGRAMMING";
		System.out.println(s.replace('A', 'q'));
		System.out.println(s.replaceAll("WELCOME", "FUCK"));
		System.out.println(s.replaceFirst("WELCOME", "WELL"));
		System.out.println("-".repeat(40) + "\n");
		String[] r = "FRED/WEKESA/AMARAUNI/MANNMARA/BULLKHESE/MARA".split("/");
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}

		String[] tokens = "Java#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++)
			System.out.print(tokens[i] + " ");
		System.out.println();
//		SIMPLE REFULAR EXPRESSIONS IN STRING MANIPULATION.
		String t = "mara#$fred@#!wekesa$#";
		System.out.println(t.replaceAll("[#@$!]", "---"));
		System.out.println("12/08/2001".matches("\\d{2}[#@$!-/]\\d{2}[#@$!-/]\\d{4}"));
		show();

	}

//	PALLINDROME PROJECT USING STRING BUILDER
	public static void filter(String s) {
		StringBuilder q = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				q.append(s.charAt(i));
			}
		}
		s = q.toString();
	}

	public static String reverse(String s) {
		StringBuilder q = new StringBuilder(s);
		q.reverse();
		return q.toString();
	}

	public static boolean isPallindrome(String s) {
		filter(s);
		if (s.equals(reverse(s))) {
			return true;
		}
		return false;
	}

	public static void show() {
		System.out.println("THE PALLINDROME GAME;\nENTER ANY NUMBER YOU WOULD WISH TO KJNOW IF IT IS A PALLINDROME");
		try (Scanner scan = new Scanner(System.in)) {
			String s = scan.next();
			System.out.printf("%s",
					s.toUpperCase() + (isPallindrome(s) ? " IS A PALLINDROME" : "IS NOT A PALLINDROME"));
		}
		System.out.println();
	}
}
