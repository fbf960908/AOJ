package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1542 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int k = cin.nextInt();
			double sum = 0;
			double fang = 200;
			double fang1 = 0;
			for (int i = 0; i < 20; i++) {
				sum += n;
				fang1 = fang * Math.pow(1 + 0.01 * k, i);
				if (sum >= fang1) {
					System.out.println(i + 1);
					break;
				}
			}
			if (sum < fang1) {
				System.out.println("Impossible");
			}
		}
		cin.close();
		cout.close();
	}
}
