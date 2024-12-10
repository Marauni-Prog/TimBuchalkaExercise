package inheritanceChallenge;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
//		try(Scanner scan= new Scanner(System.in)){
//			System.out.println("lets hire an employee");
//			System.out.println("Enter employee name");
//			String name = scan.next();
//			System.out.println("Enter birth date date/month/year");
//			String birthDate=scan.next();
//			System.out.println("Enter end date date/month/year");
//			String endDate=scan.next();
//			System.out.println("Enter hire date date/month/year");
//			String hireDate=scan.next();
//			System.out.println("Enter annual salary");
//			double annualSalary=scan.nextDouble();
//		
//		SalariedEmployee employee= new SalariedEmployee(name,birthDate,endDate,hireDate,annualSalary);
////		employee.collectPay();
//		System.out.println("Employee AGE IS "+employee.getAge());
//		System.out.println(employee);
//		System.out.println("EMployee monthly pay "+employee.collectPay());
//		}
		Worker w= new Worker("mara","01/01/2001");
		System.out.println(w.getAge());
		Employee e= new Employee("man","01/01/2002","01/01/2020");
		System.out.println(e);
		System.out.println(e.getAge());
		e.terminate("01/01/2025");
	}
	
}
