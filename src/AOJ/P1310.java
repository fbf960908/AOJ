package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1310 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		double s = Math.pow(N, 0.5);
		if (s % 1 == 0)
			System.out.println(s);
		if (N - Math.pow(s - s % 1, 2.0) > Math.pow(s - s % 1 + 1, 2.0) - N)
			System.out.println((int) Math.pow(s - s % 1 + 1, 2.0));
		else
			System.out.println((int) Math.pow(s - s % 1, 2.0));
		cin.close();
		cout.close();
	}
}
