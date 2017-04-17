package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1135 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int VUL = cin.nextInt();
			int D = cin.nextInt();
			int sum = 0;
			int time = 0;
			int n = 1;
			for (int i = 1; i < VUL * 2; i++) {
				sum += D;
				time++;
				// System.out.println(sum+" "+time);
				if (sum >= VUL) {
					System.out.println(time);
					break;
				}
				if (i == (n + n * (n - 1) / 2)) {
					time++;
					n++;
				}
			}
		}
		cin.close();
		cout.close();
	}
}
