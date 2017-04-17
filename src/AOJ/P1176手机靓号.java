package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.*;

public class P1176ÊÖ»úö¦ºÅ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int num = 0;
		while (cin.hasNext()) {
			String str = cin.nextLine();
			if (str.indexOf("4") != -1) {
				continue;
			}
			Pattern p = Pattern.compile("[6,8]");
			Matcher m = p.matcher(str);
			int i = 0;
			while (m.find()) {
				i++;
			}
			if (i >= 5) {
				System.out.println(str);
				num++;
			}
		}
		System.out.println(num);
		cin.close();
		cout.close();
	}
}
