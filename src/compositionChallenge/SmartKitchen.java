package compositionChallenge;

public class SmartKitchen {
	private CoffeeMaker brewMaster;
	private Refrigerator iceBox;
	private DishWasher dishWasher;
	
	public SmartKitchen(CoffeeMaker brewMaster, Refrigerator iceBox, DishWasher dishWasher) {
		this.brewMaster = brewMaster;
		this.iceBox = iceBox;
		this.dishWasher = dishWasher;
	}
	public void addWater() {
		brewMaster.brew();
		
	}
	
	public void pourMilk() {
		iceBox.orderFood();
		
	}
	public void loadDishWasher() {
		dishWasher.doDishes();
		
	}
	
	public void setKitchenState(boolean doDishes, boolean orderFood,boolean brew) {
		brewMaster.setHasWorkToDo(brew);
		iceBox.setHasWorkToDo(orderFood);
		dishWasher.setHasWorkToDo(doDishes);
	}
	public void doKitchenWork() {
		addWater();
		pourMilk();
		loadDishWasher();
	}
	
}

class Refrigerator {
	private boolean hasWorkToDo;

	public Refrigerator() {
		
	}

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void orderFood() {
		if(hasWorkToDo) {
			System.out.println("Ordering you food");
			hasWorkToDo =false;
		}
	}
}

class DishWasher {
	private boolean hasWorkToDo;

	public DishWasher() {
		
	}
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	public void doDishes() {
		if(hasWorkToDo) {
		System.out.println("Washing dishes");
		hasWorkToDo =false;
		}
	}
}

class CoffeeMaker {
	private boolean hasWorkToDo;

	public CoffeeMaker() {
	}
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	public void brew() {
		if(hasWorkToDo) {
		System.out.println("Brewing coffee");
		hasWorkToDo =false;
		}
	}
}
