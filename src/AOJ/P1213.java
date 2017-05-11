package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1213 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int num = 0;
			if (includeZero(N)) {
				System.out.println("Unlucky");
				continue;
			}

			for (int i = N; i > 0; i--) {
				if (!includeZero(i))
					num++;
			}
			System.out.println(num);
		}
		cin.close();
		cout.close();
	}

	private static boolean includeZero(int n) {
		String str = Integer.toString(n);
		return str.contains("0");
	}
}
