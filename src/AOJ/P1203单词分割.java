package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1203单词分割{

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		String str = cin.nextLine();
		String arr[] = str.split("\\.\\s*|\\s+|\\W+\\s*");
		for (String element : arr) {
			System.out.println(element);
		}
		cin.close();
		cout.close();
	}
}