package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.*;

public class P1226 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			StringBuffer stringbf = new StringBuffer();
			Matcher m = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
			while (m.find()) {
				m.appendReplacement(stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
			}
			System.out.println(m.appendTail(stringbf).toString());
		}
		cin.close();
		cout.close();
	}
}
