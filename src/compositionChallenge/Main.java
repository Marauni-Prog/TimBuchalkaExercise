package compositionChallenge;

public class Main {
	public static void main(String[]args) {
		CoffeeMaker brewMaster = new CoffeeMaker();
		Refrigerator iceBox = new Refrigerator();
		DishWasher dishWasher = new DishWasher();
		SmartKitchen myKitchen= new SmartKitchen(brewMaster, iceBox,dishWasher);
		
		myKitchen.addWater();
		myKitchen.loadDishWasher();
		myKitchen.pourMilk();
		myKitchen.setKitchenState(true, true, true); 
		myKitchen.doKitchenWork();
	}
}
