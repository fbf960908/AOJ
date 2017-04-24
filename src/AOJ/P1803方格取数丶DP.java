package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1803方格取数丶DP {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int[][][][] d = new int[11][11][11][11];
		int[][] map = new int[11][11];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[0].length; j++) {
				map[i][j] = 0;
			}
		}
		while (cin.hasNext()) {
			int i = cin.nextInt();
			int j = cin.nextInt();
			int k = cin.nextInt();
			if (i * j * k == 0)
				break;
			map[i][j] = k;
		}
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				for (int k = 1; k <= n; k++) {
					int l = i + j - k;
					if (l < 1 || l > n)
						continue;
					int ans = d[i][j][k][l];
					ans = Math.max(Math.max(d[i - 1][j][k - 1][l], d[i - 1][j][k][l - 1]),
							Math.max(d[i][j - 1][k - 1][l], d[i][j - 1][k][l - 1]));
					if (i == k && j == l)
						ans += map[i][j];
					else
						ans += map[i][j] + map[k][l];
					d[i][j][k][l] = ans;
				}
		System.out.println(d[n][n][n][n]);
		cin.close();
		cout.close();
	}
}
