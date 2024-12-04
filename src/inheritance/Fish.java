package inheritance;

public class Fish extends Animal{
	private int gills;
	private int fins;
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fish(String type, int weight,int gills,int fins) {
		super(type, "small", weight);
		// TODO Auto-generated constructor stub
		this.fins=fins;
		this.gills=gills;
	}
	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + ", type=" + type + super.toString() + "]";
	}
	
	private void moveMuscle() {
		System.out.print("Muscle moving ");
	}
	private void moveBackFin() {
		System.out.print("BackFin moving ");
	}
	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		moveMuscle();
		if(speed=="fast") {
			moveBackFin();
		}
		System.out.println();
	}
	
	
}
