package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1036 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		double high = 100;
		double sum = 0;
		int a = cin.nextInt();
		for (int i = 1; i <= a; i++) {
			if (i == 1) {
				sum += high;
				high /= 2;
				continue;
			}
			sum += high * 2;
			high /= 2;
		}
		String str = String.format("%.4f", sum);
		System.out.println(str);
		cin.close();
		cout.close();
	}
}
