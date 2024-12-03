package customer_classchallenge;

public class Customer {
	private String name;
	private double creditLimit;
	private String email;
	
	public Customer(String name, String email, double creditLimit) {
		this.creditLimit=creditLimit;
		this.email=email;
		this.name=name;
	}
	
	public Customer() {
		this("DEFAULT NAME","DEFAULT EMAIL",12345777);
		}
	
	public Customer(String name, String email) {
		this(name,email,1223445);
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", creditLimit=" + creditLimit + ", email=" + email + "]";
	}
	
	
	
}
