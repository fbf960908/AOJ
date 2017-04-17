package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1316 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int y = cin.nextInt();
			int x = cin.nextInt();
			int s = (x + y + 2) * (x + y + 1) / 2 - x;
			System.out.println(s);
		}
		cin.close();
		cout.close();
	}
}