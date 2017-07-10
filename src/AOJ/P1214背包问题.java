package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1214±³°üÎÊÌâ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] w = new int[n+1];
		int[] p = new int[n+1];
		for (int i = 1; i <= n; i++) {
			w[i] = cin.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			p[i] = cin.nextInt();
		}
		int dp[][] = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				if (w[i] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + p[i]);
				} else
					dp[i][j] = dp[i - 1][j];
			}
		}
		System.out.println(dp[n][m]);
		cout.close();
		cin.close();
	}
}
