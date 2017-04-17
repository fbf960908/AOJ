package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1545 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			String str = String.valueOf(a);
			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
			System.out.println(sum);
		}

		cin.close();
		cout.close();
	}
}
