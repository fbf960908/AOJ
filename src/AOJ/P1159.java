package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1159 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		String s = cin.nextLine();
		while (N-- > 0) {
			String str = cin.nextLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).matches("[0-9]"))
					System.out.print(str.substring(i, i + 1));
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
