package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1750 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int h = cin.nextInt();
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (cin.nextInt() <= h+30)
				num++;
		}
		System.out.println(num);
		cin.close();
		cout.close();
	}
}