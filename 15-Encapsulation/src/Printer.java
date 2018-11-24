
public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
		super();
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return duplex;
	}
	
	public void fillUpToner(int level) {
		
		System.out.println("Toner is filled up for "+level+"%.");
	}
	
	public void printPage(int pages) {
		pagesPrinted = pagesPrinted+pages;
		System.out.println(pages+" pages printed. Now total number of printed pages is "+pagesPrinted);

	}
}
