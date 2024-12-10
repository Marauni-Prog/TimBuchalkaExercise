package inheritanceChallenge;

import java.util.Date;

public class Worker {

	private String name;
	private String birthDate;
	protected String endDate;
	
	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = endDate;
	}
	
	public Worker(String endDate) {
		this("Default Name","01/01/1990");
	}
	
	public String getAge() {
//		Date date= new Date();
//		String currentYear="2024";
		String birthYear=birthDate.substring(6);
		int birthYearInt=Integer.parseInt(birthYear);
		System.out.println(birthYearInt);
		int k=(2024-birthYearInt);
		return ""+k;
	}
	public double collectPay() {
		return 0;
	}
	
	public void terminate(String endDate) {
		this.endDate=endDate;
		System.out.println(name+"'s contract will terminate on"+endDate);
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
}
