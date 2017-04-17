package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1038 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				System.out.println(n + "/2=" + n / 2);
				n /= 2;
			} else {
				System.out.println(n + "*3+1=" + (n * 3 + 1));
				n = n * 3 + 1;
			}
		}
		cin.close();
		cout.close();
	}
}