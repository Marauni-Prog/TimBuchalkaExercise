package BillBurger;

import java.util.Arrays;
import java.util.*;

enum Topping {
	TOMATOES, AVOCADO, CHEESE, LATTUCE, BUTTER, SOURCE;

	double getPrice() {
		return switch (this) {
		case TOMATOES -> 20;
		case AVOCADO -> 40;
		case CHEESE -> 100;
		case LATTUCE -> 30;
		case BUTTER -> 50;
		case SOURCE -> 0.0;
		default -> 0.0;
		};
	}

	static Topping setTopping(String type) {
		return switch (Character.toUpperCase(type.charAt(0))) {
		case 'T' -> TOMATOES;
		case 'A' -> AVOCADO;
		case 'C' -> CHEESE;
		case 'L' -> LATTUCE;
		case 'B' -> BUTTER;
		case 'S' -> SOURCE;
		default -> SOURCE;
		};
	}
}

enum BurgerType {
	MEAT, REGULAR, BIG, SOY;

	double getPrice() {
		return switch (this) {
		case MEAT -> 100;
		case REGULAR -> 80;
		case BIG -> 150;
		case SOY -> 120;
		default -> 80;
		};
	}

	static BurgerType setType(String type) {
		return switch (Character.toUpperCase(type.charAt(0))) {
		case 'R' -> REGULAR;
		case 'M' -> MEAT;
		case 'B' -> BIG;
		case 'S' -> SOY;
		default -> REGULAR;
		};
	}

}

public class Burger {
	private BurgerType type;
	private double basePrice;
	protected ArrayList<Topping> topping = new ArrayList<>();

	public Burger(String type, String... topping) {
		super();
		this.type = BurgerType.setType(type);
		setTopping(topping);
		this.basePrice = getBurgerPrice() + getToppingPrice();
	}

	public void setTopping(String... topping) {
		for (int i = 0; i < topping.length; i++) {
			this.topping.add(Topping.setTopping(topping[i]));
			if (i > 2) {
				break;
			}
		}
	}

	public double getBurgerPrice() {
		return type.getPrice();
	}
	public double getPrice() {
		return getBurgerPrice() + getToppingPrice();
	}

	private double getToppingPrice() {
		double price = 0;
		for (int i = 0; i <this.topping.size(); i++) {
			price += this.topping.get(i).getPrice();
		}
		return price;
	}

	public void addTopping(String topping) {
		if (this.topping.size() < 3) {
			switch (Character.toUpperCase(topping.charAt(0))) {
			case 'T' -> this.topping.add(Topping.setTopping(topping));
			case 'A' -> this.topping.add(Topping.setTopping(topping));
			case 'C' -> this.topping.add(Topping.setTopping(topping));
			case 'L' -> this.topping.add(Topping.setTopping(topping));
			case 'B' -> this.topping.add(Topping.setTopping(topping));
			case 'S' -> this.topping.add(Topping.setTopping(topping));
			default -> this.topping.add(Topping.setTopping(topping));
			}
			return;
		}
		if (this.topping.size() ==3&&this.topping.get(0).name().equalsIgnoreCase("SOURCE")) {
			this.topping.remove(0);
			switch (Character.toUpperCase(topping.charAt(0))) {
			case 'T' -> this.topping.add(1, Topping.setTopping(topping));
			case 'A' -> this.topping.add(1, Topping.setTopping(topping));
			case 'C' -> this.topping.add(1, Topping.setTopping(topping));
			case 'L' -> this.topping.add(1, Topping.setTopping(topping));
			case 'B' -> this.topping.add(1, Topping.setTopping(topping));
			case 'S' -> this.topping.add(1, Topping.setTopping(topping));
			default -> this.topping.add(1, Topping.setTopping(topping));
			}
		}
	}

	@Override
	public String toString() {
		String s = String.format("%s%14s%20.2f\n%s\n", getClass().getSimpleName(), type.name(), getBurgerPrice(), "Toppings");
		String s1 = "";

		for (int i = 0; i < this.topping.size(); i++) {
			s1 += String.format("%10s%30.2f\n", topping.get(i).name(), topping.get(i).getPrice());
		}
//		s1 += String.format("%s%23.2f", "Total BurgerPrice", basePrice);
		return s + s1;
	}

}
class DeluxeBurger extends Burger{

	public DeluxeBurger(String[] topping) {
		super("Deluxe Burger", topping);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void setTopping(String... topping) {
//		super.setTopping(topping);
		for (int i = 0; i < topping.length; i++) {
			this.topping.add(Topping.setTopping(topping[i]));
			if (i > 2) {
				break;
			}
		}
	}

	@Override
	public void addTopping(String topping) {
		if (this.topping.size() < 2) {
			switch (Character.toUpperCase(topping.charAt(0))) {
			case 'T' -> this.topping.add(Topping.setTopping(topping));
			case 'A' -> this.topping.add(Topping.setTopping(topping));
			case 'O' -> this.topping.add(Topping.setTopping(topping));
			case 'L' -> this.topping.add(Topping.setTopping(topping));
			case 'B' -> this.topping.add(Topping.setTopping(topping));
			case 'S' -> this.topping.add(Topping.setTopping(topping));
			default -> this.topping.add(Topping.setTopping(topping));
			}
		}
	}
	public double getPrice() {
		return 150.0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = String.format("%s%27.2f\n%s\n", "DELUXE BURGER", getPrice(), "Toppings");
		String s1 = "";

		for (int i = 0; i < this.topping.size(); i++) {
			s1 += String.format("%10s%30.2f\n", topping.get(i).name(), 0.00);
		}
//		s1 += String.format("%s%23.2f", "Total BurgerPrice", basePrice);
		return s + s1;
	}
	
	
}
