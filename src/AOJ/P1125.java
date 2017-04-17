package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1125 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			Yanghui(N);
			System.out.println();
		}
		cin.close();
		cout.close();
	}

	private static void Yanghui(int N) {
		int[] s = new int[N + 1];
		s[0] = 1;
		for (int i = 1; i < s.length; i++) {
			s[i] = 0;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < s.length; j++) {

				if (s[j + 1] == 0) {
					System.out.println(s[j]);
					break;
				}
				if (s[j] != 0) {
					System.out.print(s[j] + " ");
				}
			}
			for (int k = i; k > 0; k--) {
				s[k] = s[k] + s[k - 1];
			}
		}
	}
}
