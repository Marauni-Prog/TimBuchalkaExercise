package abstractClasses;

public class CookingOil extends Product {

	public CookingOil(String type, double price, String description) {
		super(type, price, description);
	}

	public CookingOil(String type, double price) {
		this(type, price, "Pure Virgin Olive Oil");
	}

	@Override
	public void showDetails() {
		System.out.printf("type %s%n%s %s-> %.2fKes%n", type, description, "-".repeat(5), price);

	}

}
