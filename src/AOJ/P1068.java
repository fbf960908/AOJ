package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1068 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[][] dp = new int[101][101];
	static int[][] ss = new int[101][101];
	static int N;

	public static void main(String args[]) {
		int T = cin.nextInt();
		while (T-- > 0) {
			N = cin.nextInt();
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					ss[i][j] = cin.nextInt();
					dp[i][j] = -1;
				}
			}
			System.out.println(Max(1, 1));
		}
	}

	private static int Max(int i, int j) {
		if (dp[i][j] != -1)
			return dp[i][j];
		if (i == N)
			dp[i][j] = ss[i][j];
		else {
			dp[i][j] = Math.max(Max(i + 1, j), Max(i + 1, j + 1)) + ss[i][j];
		}
		return dp[i][j];
	}
}