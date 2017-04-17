package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1186 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			char[] ss = str.toCharArray();
			for (int i = 0; i < ss.length; i++) {
				String a = Integer.toBinaryString(Integer.parseInt(ss[i] + "", 16));
				if (a.length() == 4) {
					System.out.print(a);
				} else {
					for (int j = 0; j < 4 - a.length(); j++) {
						System.out.print("0");
					}
					System.out.print(a);
				}
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}