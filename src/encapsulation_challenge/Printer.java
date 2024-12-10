package encapsulation_challenge;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel>100? -1:tonerLevel<100?-1:tonerLevel;
		this.pagesPrinted = 0;;
		this.duplex = duplex;
	}
	
	public Printer(int tonerLevel) {
		this(tonerLevel,true);
		
	}
	public int addToner(int tonerAmount) {
		if((tonerLevel+tonerAmount>100)||(tonerLevel+tonerAmount<0)) {
//			tonerLevel=100;
			return -1;
		}
		return tonerLevel+tonerAmount;
	}
	public int printPages(int pages) {
		if(duplex) {
			System.out.println("THIS IS A DUPLEX PRINTER");
			pagesPrinted= pages/2+pages%2;
			return pagesPrinted;
		}
		pagesPrinted=pages*2;
		return pagesPrinted;
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
