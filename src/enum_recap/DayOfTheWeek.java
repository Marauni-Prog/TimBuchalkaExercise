package enum_recap;

import java.security.SecureRandom;
import java.util.Random;

public enum DayOfTheWeek {
MON, TUES, WED, THUR, FRI, SAT, SUN;
	
	public String getName() {
		return switch(this) {
		case MON ->"monday";
		case TUES ->"Tuesday";
		case WED->"Wednesday";
		case THUR ->"Thursday";
		case FRI-> "Friday";
		case SAT->"Saturday";
		case SUN ->"Sunday"; 
		default->"";
		};
	}
}

class Main{
	public static void main(String[]args) {
		DayOfTheWeek weekDay =  DayOfTheWeek.MON;
		System.out.println(weekDay);
		System.out.println(DayOfTheWeek.FRI.getName());
		for(int i=0;i<10;i++) {
			getRandomDay();
		}
	}
	
	public static void getRandomDay() {
		var random = new Random().nextInt(7);
		var random1= new SecureRandom().nextInt(7);
		var days= DayOfTheWeek.values();
		System.out.println(days[random1].getName());
		if(days[random].getName().equalsIgnoreCase("Friday")) {
			System.out.println("Its a FRIDAY!!!!!");
		}
	}
}
