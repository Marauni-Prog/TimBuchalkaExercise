package composition;

public class Main {
	public static void main(String[]args) {
	ComputerCase compcase= new ComputerCase("2208","dell","240v AC");
	Monitor monitor = new Monitor("27 inch beast","ACer",27,"4k");
	MotherBoard motherBoard= new MotherBoard("BJ-200","ASUS",4,6,"V2.44");
	
	PersonalComputer comp= new PersonalComputer("2208","dell",
			monitor, motherBoard,compcase);
//	
//	comp.getMonitor().drawPixelAt(5, 7, "YEllow");
//	comp.getComputerCase().pressPowerButton();;
//	comp.getMotherBoard().loadProgram("Windows OS");
	comp.powerUp();
	}
}
