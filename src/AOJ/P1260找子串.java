package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1260找子串{

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			String s = cin.nextLine();
			Pattern p = Pattern.compile(s);
			Matcher m = p.matcher(str);
			int i = 0;
			while (m.find()) {
				i++;
			}
			System.out.println(i);
		}

		cin.close();
		cout.close();
	}
}
