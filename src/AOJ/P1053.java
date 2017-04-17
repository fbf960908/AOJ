package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.*;

public class P1053 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		String s = cin.nextLine();
		while (N-- > 0) {
			String str = cin.nextLine();
			Pattern a = Pattern.compile("[A-Z]");
			Pattern b = Pattern.compile("[a-z]");
			Pattern c = Pattern.compile("[0,9]");
			Pattern d = Pattern.compile("[~,!,@,#,$,%,^]");
			int i = 0;
			if (str.length() >= 8 && str.length() < 16) {
				Matcher aa = a.matcher(str);
				if (aa.find()) {
					i++;
				}
				Matcher bb = b.matcher(str);
				if (bb.find()) {
					i++;
				}
				Matcher cc = c.matcher(str);
				if (cc.find()) {
					i++;
				}
				Matcher dd = d.matcher(str);
				if (dd.find()) {
					i++;
				}
				if (i >= 3) {
					System.out.println("YES");
					continue;
				}
			}
			System.out.println("NO");
		}
		cin.close();
		cout.close();
	}
}
