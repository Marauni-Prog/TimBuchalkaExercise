package groceryList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Grocery list = new Grocery();
		try (Scanner scan = new Scanner(System.in)) {
			int input = 1;
			do {
				System.out.println("""
						Available Actions:
						0 - to shutDown.
						1 - to add item(s)to list ( COMMA DELIMITED LIST)
						2 - to remove items ( COMMA DELIMITED LIST)
						Enter a number for Which action you want to do
						""");
				try {
					input = scan.nextInt();
					if (input == 1) {
						String s = scan.next();
						list.addItem(s);
					} else if (input == 2) {
						String s = scan.next();
						list.removeItem(s);
					} 
				} catch (Exception e) {
					System.out.println("Enter a valid input\n");
					 e.printStackTrace();
					scan.nextLine();
				}

			} while (input != 0);
		}
		System.out.println(list);
	}

}
