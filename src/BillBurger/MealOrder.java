package BillBurger;

public class MealOrder {
	private Burger burger;
	private Drink drink;
	private SideItem side;
//	private DeluxeBurger deluxe;

	public MealOrder(Burger burger, Drink drink, SideItem side) {
		this.burger = burger;
		this.drink = drink;
		this.side = side;
	}

	public MealOrder(String... topping) {
		this(new DeluxeBurger(topping), new Drink(1), new SideItem("f"));
	}

	public MealOrder() {
		this(new Burger("r", "s"), new Drink(2), new SideItem("f"));
	}

	public void addTopping(String type) {
		burger.addTopping(type);
	}

	private double getTotalPrice() {
		double price = 0;
		if (burger instanceof DeluxeBurger deluxe) {
			price = deluxe.getPrice();
			return price;
		}
		price = burger.getPrice() + drink.getPrice() + side.getPrice();
		return price;
	}

	@Override
	public String toString() {
		String s = String.format("%s%28.2f", "TOTAL PRICE ", getTotalPrice());
		String s1 = String.format("\n%s\n", ".".repeat(40));
		if (burger instanceof DeluxeBurger) {
			return burger.toString() + s1 + drink.getType() + s1 + side.getType() + s1 + s;
		}

		return burger.toString() + s1 + drink.toString() + s1 + side.toString() + s1 + s;
	}

}
