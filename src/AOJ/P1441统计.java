package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1441Í³¼Æ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			String s = cin.nextLine();
			Pattern p = Pattern.compile(str.toLowerCase());
			Matcher m = p.matcher(s.toLowerCase());
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