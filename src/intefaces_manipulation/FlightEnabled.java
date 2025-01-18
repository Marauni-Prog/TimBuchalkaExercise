package intefaces_manipulation;

public interface FlightEnabled {
	double MILES_TO_KM=1.60934;
	double KM_TO_MILES=0.621371;
	void takingOff();
	void land();
	void fly();
}

interface Trackable{
	void tracking();
	default void isTracking() {
		System.out.println("The tracker is on");
	}
	static boolean isTrackable() {
		return true;
	}
}
