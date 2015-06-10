public class Symbol {
	String shortName = null;
	String companyName = null;

	public Symbol(String ticker, String name) {
		shortName = ticker;
		companyName = name;
	}
	
	public Symbol(String ticker) {
		shortName = ticker;
	}

	public String toString() {
		return (shortName + " " + companyName);
	}
	
	public String getTicker() {
		return shortName;
	}
}
