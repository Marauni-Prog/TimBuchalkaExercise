package polymorphism_challenge;

public class Main {
	public static void main(String[]args) {
		var car= Car.getCar("e", "TESLA RED CONVERTIBLE");
		description(car);
		var car1= Car.getCar("H", "Luxury lexus duma suv");
		description(car1);
		var car2 =Car.getCar("g", "TOYOTA PRADO SUV");
		var car3= Car.getCar("G","TOYOTA FORTUNER");
		System.out.println(car2.equals(car1));
		System.out.println(car2.equals(car2));
		System.out.println(car2.equals(car3));
		System.out.println(car2.equals(car));
		 var gas= new GasPoweredCar("Toyota LandCruiser",240,12);
		 System.out.println(car2.equals(gas));
		 var gas1= new GasPoweredCar("Toyota LandCruiser",240,6);
		 System.out.println(car2.equals(gas1));
	
	}
	public static void description(Car car) {
		if(car instanceof ElectricCar e) {
			System.out.println(ElectricCar.class.getSimpleName());
			e.startEngine();
			e.drive();
		}else if(car instanceof GasPoweredCar e) {
			System.out.println(GasPoweredCar.class.getSimpleName());
			e.startEngine();
			e.drive();
		}else if(car instanceof HybridCar e) {
			System.out.println(HybridCar.class.getSimpleName());
			e.startEngine();
			e.drive();
		}
		System.out.println();
	}
	

}
