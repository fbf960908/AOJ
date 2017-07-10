package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String args[]) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int [] w =new int [n+1];
			int [] p = new int [n+1];
			for (int i = 1; i <= n; i++) {
				w[i] = cin.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				p[i] = cin.nextInt();
			}
			int [] dp = new int [m+1];
			dp[0] = 0;
			for (int i = 1; i < n; i++) {
				for (int j = m; j >=w[i]; j--) {
					dp[j]=Math.max(dp[j],dp[j-w[i]]+p[i]);
				}
			}
			System.out.println(dp[m]);
		}
	}
}