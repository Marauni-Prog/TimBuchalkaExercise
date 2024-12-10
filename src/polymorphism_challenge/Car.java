package polymorphism_challenge;

public class Car {
	private String description;

	public Car(String description) {
		this.description = description;
	}

	public void startEngine() {

	}

	public void drive() {
		runEngine();
	}

	protected void runEngine() {
		System.out.println("Engine running");
	}
	public static Car getCar(String type, String description) {
		return switch(Character.toUpperCase(type.charAt(0))) {
		case 'E'->new ElectricCar(description);
		case 'G'->new GasPoweredCar(description);
		case 'H'->new HybridCar(description);
		default->new Car(description);
		};
	}
	public void description(Car car) {
		if(car instanceof ElectricCar e) {
			System.out.println(ElectricCar.class.getSimpleName());
		}else if(car instanceof GasPoweredCar e) {
			System.out.println(GasPoweredCar.class.getSimpleName());
		}else if(car instanceof HybridCar e) {
			System.out.println(HybridCar.class.getSimpleName());
		}
	}

	

}

class GasPoweredCar extends Car {
	private double avgKmPerLitre;
	private int cylinders;

	public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
		// TODO Auto-generated constructor stub
	}
	public GasPoweredCar(String description) {
		this(description,240,6);
	}
	public void startEngine() {
		System.out.println("Engine stated");
	}
	public void drive() {
		super.drive();
		System.out.println("Driving a diesel beast");
		System.out.println("Accelerating at 100kmperhour");
	}
	
	public boolean equals(Object obj) {
//		if(obj instanceof GasPoweredCar e) {
//			return cylinders==e.getCylinders();
//		}
//		return false;
		
		return (obj instanceof GasPoweredCar e)? (cylinders==e.getCylinders()):false;
	}
	
	public int getCylinders() {
		return cylinders;
	}

}

class ElectricCar extends Car {
	private double avgKmPerCharge;
	private int batterySize;

	public ElectricCar(String description, double avgKmPerLitre, int batterySiz) {
		super(description);
		this.avgKmPerCharge = avgKmPerLitre;
		this.batterySize = batterySiz;
		// TODO Auto-generated constructor stub
	}
	public ElectricCar(String description) {
		this(description,240,100);
	}
	public void startEngine() {
		System.out.println("Engine stated");
	}
	public void drive() {
		super.drive();
		System.out.println("Driving an Ekectric car");
		System.out.println("Accelerating at 100kmperhour");
	}

}

class HybridCar extends Car {
	private double avgKmPerLitre;
	private int batterySize;
	private int cylinders;

	public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}
	public HybridCar(String description) {
		this(description,240,100,6);
	}
	public void startEngine() {
		System.out.println("Engine stated");
	}
	public void drive() {
		super.drive();
		System.out.println("Driving a Hybrid car");
		System.out.println("Accelerating at 100kmperhour");
	}

}