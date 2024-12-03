package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
public static void main (String[]args){
try (//	System.out.println("Enter Mins");
	Scanner scan = new Scanner(System.in)) {
		//	int min=scan.nextInt();
//	System.out.println("Enter secs");
//	int sec=scan.nextInt();
//	
//	System.out.println(gerDurationString(sec));
//	System.out.println(gerDurationString(sec,min));
		try {
		System.out.println("ENTER MONTH OF THE YEAR IN NUMBERS");
		int month= scan.nextInt();
		System.out.println("The month the year is "+ getMonth(month));
		}catch(InputMismatchException a) {
			System.out.println("ENTER A VALID MONTH");
		}
	}
	
}
public static  double convertToCm(double height) {
	double conveter=0;
	return height*conveter;
}
public static double convertToCm(double heightFeet, double heightinches ) {
	double converter1=0;
	double converter2=0;
	return (heightFeet*converter1)+(heightinches*converter2);
}

public static String gerDurationString(int sec) {
	if(sec>=0) {
	int hours =sec/(60*60);
	int minutes = (sec%(3600))/60;
	int remainingsec=(sec%3600)%60;
	return ""+hours+"H "+minutes+"M "+remainingsec+"S";}
	else 
		return "INVALID INPUT";
}
public static String gerDurationString(int sec, int min) {
	if((sec<60&&sec>=0)&&min>=0) {
	int hours =min/(60);
	int minutes = min%60;
	int remainingsec=sec;
	return ""+hours+"H "+minutes+"M "+remainingsec+"S";
	}else
		return "INVALID INPUT";
	
}
public static String getMonth(int month) {
	return switch(month) {
	case 1 -> "JAN";
	case 2 -> "FEB";
	case 3 -> "MARCH";
	case 4 -> "APRIL";
	case 5 -> "MAY";
	case 6 -> "JUNE";
	case 7 -> "JULY";
	case 8 -> "AUGUST";
	case 9 -> "SEPT";
	case 10 -> "OCT";
	case 11 -> "NOV";
	case 12 -> "DEC";
	default-> "INVALID INPUT";
	};
}
}
