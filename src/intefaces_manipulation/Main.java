package intefaces_manipulation;

public class Main {
	public static void main(String[] args) {
		Bird b = new Bird();
		Jet jet = new Jet();
		Truck t = new Truck();
		double kmTravelled = 1000;
		System.out.println("The JET travelled " + kmTravelled * Jet.KM_TO_MILES + " MILES");

//		b.takingOff();
//		b.fly();
//		b.tracking();
//		b.land();
//		b.move();
		inFlight(b);
		inFlight(jet);
		t.tracking();
	}

	public static void inFlight(FlightEnabled flier) {
		flier.takingOff();
		flier.fly();
		if (flier instanceof Trackable track) {
			
			System.out.println(track.getClass().getSimpleName()+Trackable.isTrackable() != null? "Is Trackable":"is not Trackable");
			track.isTracking();
			track.tracking();
			
		}
		flier.land();
		System.out.println();
	}
}
