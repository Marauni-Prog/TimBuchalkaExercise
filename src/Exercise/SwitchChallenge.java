package Exercise;

import java.util.Scanner;

public class SwitchChallenge {
	public static void main(String[]args) {
		try {
		Scanner  scan= new Scanner(System.in);
		System.out.println("ENTER A NATO CHARACTER");
		String a=scan.nextLine();
		a.toUpperCase();
		System.out.println("THE NATO ALPHABET IS "+natoAlphabet(a.charAt(0)));
		}catch(Exception e) {
			System.out.println("ENTER A VALID VALUE");
		}
	}
public static String natoAlphabet(char c) {
	String nato=switch(c) {
	case 'A'-> "Able";
	case 'B' -> "Baker";
	case 'C'->"Chalie";
	case 'D' ->"Dog";
	case 'E' ->"Easy";
	default ->"NOT FOUND";
	};
	return nato;
}
}
