package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1136 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int[][] ss = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				ss[i][j] = cin.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j == N - 1) {
					System.out.print(ss[j][i]);
					break;
				}
				System.out.print(ss[j][i] + " ");
			}
			if (i != N)
				System.out.println();
		}
		cin.close();
		cout.close();
	}
}
