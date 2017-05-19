package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1841 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	final static int maxn = 1000010;

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int[] s = new int[maxn];
			int[][] dp = new int[maxn][30];
			String str = cin.nextLine();
			char[] ch = str.toCharArray();
			int len1 = ch.length;
			int loc = -1;
			for (int i = 0; i < len1; i++) {
				if (ch[i] == '0')
					continue;
				else {
					loc = i;
					break;
				}
			}
			if (loc == -1)
				System.out.println("-1s");
			else {
				int len2 = 0;
				boolean flag = false;
				for (int i = 1, j = loc; j < len1; j++, i++) {
					s[i] = ch[j] - '0';
					len2++;
					if (s[i] == 0)
						flag = true;
				}
				dp[1][s[1] % 6] = 1;
				for (int i = 2; i <= len2; i++) {
					if (s[i] != 0)
						dp[i][s[i] % 6] = 1;
					for (int j = 0; j <= 5; j++) {
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
						if (dp[i - 1][j] != 0)
							dp[i][((10 * j) + s[i]) % 6] = Math.max(dp[i][((10 * j) + s[i]) % 6], dp[i - 1][j] + 1);

					}
				}
				if (dp[len2][0] == 0) {
					if (flag)
						System.out.println("1");
					else
						System.out.println("-1s");
				} else
					System.out.println(dp[len2][0]);
			}
		}

		cin.close();
		cout.close();
	}
}
