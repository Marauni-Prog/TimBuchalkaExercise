package abstractClasses;

public abstract class Product {
	protected String type;
	protected double price;
	protected String description;

//	private OrderItem order;
	public Product(String type, double price, String description) {
		super();
		this.type = type;
		this.price = price;
		this.description = description;
	}

	protected double getSalesPrice(int quantity) {
		return quantity * price;
	}

	protected void getPricedItems(int quantity) {
		System.out.printf("%d %s %s %.2f%n", quantity, type, "@", getSalesPrice(quantity));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product p) {
			String s = p.type;
			return (this.type.equalsIgnoreCase(s));
		}
		return false;
	}

	public abstract void showDetails();
}
