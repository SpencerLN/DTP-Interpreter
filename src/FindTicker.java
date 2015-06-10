import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FindTicker {

	public FindTicker() {

	}

	public static Symbol isAStock(String name) {
		ArrayList<Symbol> symbols = createSymbolList.getArray();
		for (Symbol symbol : symbols) {
			//System.out.println(symbol.getTicker());
			if (symbol.getTicker().equals(name)) {
				return symbol;
			}
		}

		return null;

	}

	public static String FindTheSymbol(String symbol) {
		String toReturn = null;
		FileInputStream in = null;
		PrintStream out = null;

		try {
			in = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out = new PrintStream("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner read = new Scanner(in);
		while (read.hasNext()) {

		}

		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
		return toReturn;

	}
}
