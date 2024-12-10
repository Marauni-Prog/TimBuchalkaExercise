package inheritanceChallenge;

public class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired;
	public SalariedEmployee(String name, String birthDate, String hireDate,
			double annualSalary,boolean isRetired) {
		super(name, birthDate, hireDate);
		this.annualSalary=annualSalary;
		this.isRetired=isRetired;
		// TODO Auto-generated constructor stub
	}
	public SalariedEmployee(String name, String birthDate, String endDate, String hireDate,
			double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary=annualSalary;
		this.isRetired=false;
		// TODO Auto-generated constructor stub
	}
	
	public void retire() {
		if(Integer.parseInt(getAge())>50) {
			isRetired=true;
		}
	}
	@Override
	public double collectPay() {
		// TODO Auto-generated method stub
		if(isRetired) {
		return annualSalary/2;
		}
		return annualSalary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
