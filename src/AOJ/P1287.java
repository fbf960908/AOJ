package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1287 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int num = 0;
			while (N != 1) {
				if (N % 2 != 0)
					N = 3 * N + 1;
				else
					N /= 2;
				num++;
			}
			System.out.println(num);
		}

		cin.close();
		cout.close();
	}
}
