package inheritanceChallenge;

public class Employee extends Worker {
	private String employeeId;
	private String hireDate;
	private static int id=(int)(Math.random()*100000);

	public Employee(String name, String birthDate,String hireDate) {
		super(name, birthDate);
		this.employeeId=""+(Employee.id++);
		this.hireDate=hireDate;
	}

	@Override
	public double collectPay() {
		return 0;
	}

	@Override
	public void terminate(String endDate) {
		int hire=Integer.parseInt(hireDate.substring(6));
		int fire=Integer.parseInt(endDate.substring(6));
		int hireMonth=Integer.parseInt(hireDate.substring(4,5));
		int fireMonth=Integer.parseInt(endDate.substring(4,5));
		if(hire>fire||(hire==fire&&hireMonth>fireMonth)) {
			super.terminate(endDate);
		}
	
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + "]" +super.toString();
	}
	
}
