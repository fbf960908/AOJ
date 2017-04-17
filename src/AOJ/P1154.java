package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1154 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).matches("[1]"))
					System.out.print("0");
				if (str.substring(i, i + 1).matches("[0]"))
					System.out.print("1");
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
