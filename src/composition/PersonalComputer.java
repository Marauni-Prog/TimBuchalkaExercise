package composition;

public class PersonalComputer extends Product{
	private Monitor monitor;
	private MotherBoard motherBoard;
	private ComputerCase computerCase;

	public PersonalComputer(String model, String manufacturer,
			Monitor monitor, MotherBoard motherBoard, ComputerCase computerCase) {
		super(model, manufacturer);
		this.computerCase=computerCase;
		this.monitor=monitor;
		this.motherBoard=motherBoard;
		// TODO Auto-generated constructor stub
	}

//	public Monitor getMonitor() {
//		return monitor;
//	}
//
//	public MotherBoard getMotherBoard() {
//		return motherBoard;
//	}
//
//	public ComputerCase getComputerCase() {
//		return computerCase;
//	}
	private void drawLogo() {
		monitor.drawPixelAt(1200,10,"Yellow");
	}
	
	public void powerUp() {
		computerCase.pressPowerButton();
		drawLogo();
	}

}
