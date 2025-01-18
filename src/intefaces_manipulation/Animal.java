package intefaces_manipulation;

public abstract class Animal {
	public abstract void move();
}

class Bird extends Animal implements FlightEnabled, Trackable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bird is moving");
	}

	@Override
	public void tracking() {
		// TODO Auto-generated method stub
		System.out.println("COODINATES WERE RECORDED");
	}

	@Override
	public void takingOff() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " IS TAKING OFF");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " IS LANDING");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " IS FLYING");
	}

}

class Truck implements Trackable {
	public void tracking() {
		// TODO Auto-generated method stub
		System.out.println("COODINATES WERE RECORDED");
	}

}

class Jet implements FlightEnabled, Trackable {
	@Override
	public void tracking() {
		// TODO Auto-generated method stub
		System.out.println("COODINATES WERE RECORDED");
	}

	@Override
	public void takingOff() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " IS TAKING OFF");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " IS LANDING");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " IS FLYING");
	}
}
