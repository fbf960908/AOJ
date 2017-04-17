package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1033 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int s = 0;
		int num = 1;
		for (int i = 1; s <= n; i++) {
			s += i * i * i;
			num = i - 1;
		}
		System.out.println(num);
		cin.close();
		cout.close();
	}
}
