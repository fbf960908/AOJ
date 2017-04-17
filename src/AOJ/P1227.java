package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1227 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int a = cin.nextInt();
		String o = cin.nextLine();
		while (a-- > 0) {
			int num = 0;
			String str = cin.nextLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).matches("[0-9]"))
					num++;
			}
			System.out.println(num);
		}
		cin.close();
		cout.close();
	}
}
