package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1126 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			char max = '0';
			for (int i = 0; i < str.length(); i++) {
				char s = str.charAt(i);
				if (s > max) {
					max = s;
				}
			}
			str = str.replaceAll(max + "", max + "(max)");
			System.out.println(str);
		}
		cin.close();
		cout.close();
	}
}
