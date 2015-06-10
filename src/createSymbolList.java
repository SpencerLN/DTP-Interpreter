import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class createSymbolList {

	public createSymbolList() {

	}

	static ArrayList<Symbol> symbols = null;
	public static void makeList() {
		symbols = new ArrayList();
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
		while (read.hasNextLine()) {
			String line = read.nextLine();
			String[] symbolsArray = line.split("[|]+");
			//System.out.println(symbolsArray[1] + " " + symbolsArray[2]);
//			out.println(symbolsArray[1] + " " + symbolsArray[2]);
			if(symbolsArray[1] != null && symbolsArray[2] != null) {
			Symbol toAdd = new Symbol(symbolsArray[1],symbolsArray[2]);
			symbols.add(toAdd);
			}
		}

		//System.out.print(symbols);
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
		//System.out.println("hi");
		//for (int i = 0; i < symbols.size(); i++) {
			//System.out.println(symbols.get(i));
		//}
	}
	
	public static ArrayList getArray() {
		return symbols;
	}
}
