
public class Position {

	Symbol security = null;
	Double open = null;
	Double target = null;
	Double stop = null;
	
	public Position() {
		security = null;
		open = 0.00;
		target = 0.00;
		stop = 0.00;
	}
	
	public Position(Symbol secName, Double initOpen, Double initTarget, Double initStop) {
		security = secName;
		open = initOpen;
		target = initTarget;
		stop = initStop;
	}
}
