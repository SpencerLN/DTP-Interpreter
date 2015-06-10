//Imports
import java.util.ArrayList;
import java.util.Scanner;
public class Interpreter {

	public Interpreter() {
		// TODO Auto-generated constructor stub
	}
	
	static Symbol theStock = null;
	
	public static void main(String[] args) {
		createSymbolList.makeList();
		String input = new String("long UGAZ 3.48 500");
		
		Scanner readit = new Scanner(input);
		
		ArrayList<String> words = new ArrayList();
		
		while(readit.hasNext()) {
			String next = readit.next();
			words.add(next);
			System.out.println(next);
			if(checkTicker(next)) {
				theStock = (FindTicker.isAStock(next));
				break;
			}
		}
		System.out.println(input);
		if (theStock == null) {
			//check more
		} else {
			// identify type of transaction
			
			
		}
	}

	public static boolean checkTicker(String word) {
		Symbol toFind = FindTicker.isAStock(word);
		if (toFind != null) {
			System.out.println(toFind);
			return true;
		} else {
			System.out.println("got nothin");
			return false;
		}
	}
	
	public static String getType(String toProc) {
		String toRet = null;
				
		Scanner readit = new Scanner(toProc);
		while(readit.hasNext()) {
			String word = readit.next();
			
			switch(word.toLowerCase()) {
			case "long" : return "long";
			case "bid" : return "buy";
			}
		}
		
		
		
		
		
		
		return toRet; 
		
	}
}
