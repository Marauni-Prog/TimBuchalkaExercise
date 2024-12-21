package BillBurger;
enum DrinkTypes{
	TEA,COFFEE,SODA,PEPSI,JUICE;
	double getPrice() {
		return switch(this) {
		case  TEA->50.0;
		case COFFEE->100.0;
		case SODA->80.0;
		case PEPSI->80.0;
		case JUICE->100.0;
		default->0.0;
		};
	}
	
}
enum SideTypes{
	CHICKEN_WINGS,FRIES,PUDDING,STEAK,BISCUITS;
	double getPrice() {
		return switch(this) {
		case CHICKEN_WINGS->100;
		case FRIES->80;
		case PUDDING->50;
		case STEAK -> 100;
		case BISCUITS->60;
		default->0.0;
		};
	}
	static String setType(String type) {
		return switch(Character.toUpperCase(type.charAt(0))) {
		case 'C'->CHICKEN_WINGS.name();
		case 'F'->FRIES.name();
		case 'P'->PUDDING.name();
		case 'S' -> STEAK.name();
		case 'B'->BISCUITS.name();
		default->"";
		};
	}
}
public class Drink {
	private String type;
	private int size;
	private double price;
	public Drink(String type, int size) {
		super();
		setType(type);
		this.size = size>4||size<0?1:size;
		this.price = getPrice(type);
	}
	
	public Drink(int size) {
		this("soda", size);
	}
	public String getType() {
		return type;
	}
	private void setType(String type) {
		this.type=switch(Character.toUpperCase(type.charAt(0))) {
		case 'T' -> DrinkTypes.TEA.name();
		case 'C'-> DrinkTypes.COFFEE.name();
		case 'P'->DrinkTypes.PEPSI.name();
		case 'S'->DrinkTypes.SODA.name();
		case 'J'->DrinkTypes.JUICE.name();
		default->"WATER";
		};
	}
	
	private double getPrice(String type) {
		return switch(Character.toUpperCase(type.charAt(0))) {
		case 'T' -> DrinkTypes.TEA.getPrice()*size;
		case 'C'-> DrinkTypes.COFFEE.getPrice()*size;
		case 'P'->DrinkTypes.PEPSI.getPrice()*size;
		case 'S'->DrinkTypes.SODA.getPrice()*size;
		case 'J'->DrinkTypes.JUICE.getPrice()*size;
		default->0.0;
		};
	}
	public double getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		String s=String.format("%s%15s%s%19.2f","DRINK",type+" X",""+size,price);
		return s;
	}
	
	
}
class SideItem{
	private String type;
	private double price;
	public SideItem(String type) {
		super();
		this.type = SideTypes.setType(type);
		this.price = getPrice(type);
	}
	
	private double getPrice(String type) {
		return switch(Character.toUpperCase(type.charAt(0))) {
		case 'C'->SideTypes.CHICKEN_WINGS.getPrice();
		case 'F'->SideTypes.FRIES.getPrice();
		case 'P'->SideTypes.PUDDING.getPrice();
		case 'S'->SideTypes.STEAK.getPrice();
		case 'B'->SideTypes.BISCUITS.getPrice();
		default->0.0;
		};
	}
	public double getPrice() {
		return this.price;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		String s=String.format("%s%11s%20.2f", "SIDE ITEM",type,price);
		return s;
	}
	
}
