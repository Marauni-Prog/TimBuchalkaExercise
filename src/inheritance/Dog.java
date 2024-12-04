package inheritance;

public class Dog extends Animal {
	private String earShape;
	private String tailShape;

	public Dog(String type, String size, int weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}
	public Dog() {
		super("MUTT","BIG",50);
	}
	public Dog(String type,int weight, String earShape, String tailShape) {
		super(type, weight<15?"Small":(weight<35)?"Medium":"Large",weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}
	
	public Dog(String type, int weight) {
		this(type,weight,"PERKY","CURLED");
	}
	@Override
	public String toString() {
		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + super.toString()+"]";
	}
	@Override
	public void move(String speed) {	
		super.move(speed);

		if(speed.equalsIgnoreCase("slow")) {
			walk();
			wagtail();
		}else {
			run();
			bark();
		}
		System.out.println();
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		if(type=="wolf") {
			System.out.println("yooo hoooo");
		}
	}
	
	private void bark() {
		System.out.print("Woof!");
	}
	private void run() {
		System.out.println("Runs");
	}
	private void walk() {
		System.out.println("Dog walking");
	}
	private void wagtail() {
		System.out.println("Tail wagging");
	}
}
	
