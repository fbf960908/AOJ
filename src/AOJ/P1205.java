package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1205 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int a = cin.nextInt();
		while (a-- > 0) {
			String str = cin.next();
			String[] chars = new String[3];
			for (int i = 0; i < str.length(); i++) {
				chars[i] = str.substring(i, i + 1);
			}
			Arrays.sort(chars);
			for (int i = 0; i < chars.length; i++) {
				if (i == chars.length - 1)
					System.out.print(chars[i]);
				else
					System.out.print(chars[i] + " ");
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
