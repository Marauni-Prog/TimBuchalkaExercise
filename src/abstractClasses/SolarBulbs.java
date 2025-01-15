package abstractClasses;

public class SolarBulbs extends Product {

	public SolarBulbs(String type, double price, String description) {
		super(type, price, description);
		// TODO Auto-generated constructor stub
	}

	public SolarBulbs(String type, double price) {
		this(type, price, "PHILLIPS Energy Saving Bulb");
	}

	@Override
	public void showDetails() {
		System.out.printf("type %s%n%s %s-> %.2fKes%n", type,description,"-".repeat(5) ,price);

	}

}
