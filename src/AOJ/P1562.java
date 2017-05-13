package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1562 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String s = cin.nextLine();
			String ss = s.replaceFirst(" ", "|");
			String [] sss = ss.split("\\|");
			String a = sss[0];
			String b = sss[1];
			if (isInt(a) && isInt(b)) {
				int ans = Integer.parseInt(a) + Integer.parseInt(b);
				System.out.println(a + " + " + b + " = " + ans);
			} else {
				System.out.print(isInt(a) ? a : "?");
				System.out.print(" + ");
				System.out.print(isInt(b) ? b : "?");
				System.out.println(" = ?");
			}
		}
		cin.close();
		cout.close();
	}

	private static boolean isInt(String a) {

		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(a);
		int num = a.length();
		int i = 0;
		while (m.find()) {
			i++;
		}
		if (i == num) {
			if (Integer.parseInt(a) >= 1 && Integer.parseInt(a) <= 1000) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
}
