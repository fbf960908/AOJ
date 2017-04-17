package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1087 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			String str1 = str.replaceAll("\\s", "");
			System.out.println(str1);
		}
		cin.close();
		cout.close();
	}
}
