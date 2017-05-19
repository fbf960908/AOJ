package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class p1328 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			String ss = str.toUpperCase();
			System.out.println(ss.charAt(0) + ss.substring(1, ss.length()).toLowerCase());
		}
		cin.close();
		cout.close();
	}
}
