package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1006 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			String ss[] = cin.nextLine().split("\\.");
			cout.println(check(ss) ? "Y" : "N");
		}
		cin.close();
		cout.close();
	}

	private static boolean check(String[] ss) {
		for (String s : ss)
			if (!check(s))
				return false;
		return true;
	}

	private static boolean check(String s) {
		int n;
		try {
			n = Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return n >= 0 && n <= 255;
	}
}