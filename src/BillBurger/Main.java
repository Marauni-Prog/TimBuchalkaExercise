package BillBurger;

public class Main {
	public static void main(String[]args) {
//		Drink drink=new Drink(29);
//		System.out.println(drink);
//		Drink drink1= new Drink("w",2);
//		System.out.println(drink1);
//		SideItem side= new SideItem("F");
//		System.out.println(side);
//		Burger b= new Burger("s","t","t","h");
//		System.out.println(b);
		
		MealOrder meal = new MealOrder();
		meal.addTopping("a");
		meal.addTopping("C");
		meal.addTopping("C");
		meal.addTopping("C");
		
		System.out.println(meal);
		System.out.println();
		MealOrder meal1=new MealOrder("C","A");
		System.out.println(meal1);
	}
}
