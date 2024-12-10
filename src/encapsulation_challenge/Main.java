package encapsulation_challenge;

public class Main {
	public static void main(String[]args) {
		Printer print= new Printer(20);
		print.addToner(27);
		System.out.println(print.printPages(525));
	}
}
