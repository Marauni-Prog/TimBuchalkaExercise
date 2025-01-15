package abstractClasses;

public class Main {
	public static void main(String[]args) {
		Product p1= new CookingOil("RINA",270);
		Product p2= new SolarBulbs("Phllips",150);
		
		OrderItem o1 = new OrderItem(20,p1);
		OrderItem o2 = new OrderItem(20,p2);
		OrderItem o3= new OrderItem(31,new CookingOil("UFUTA",200));
		
		Store s= new Store();
		s.addItem(new CookingOil("UFUTA",200),new CookingOil("UFUTA",200),new CookingOil("UFUTA",200)
				,p1,p2);
		s.addOrder(o1,o2,o3);
		s.process();
		s.display();
		}
}
