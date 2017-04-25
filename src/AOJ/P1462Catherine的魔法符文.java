package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1462CatherineµÄÄ§·¨·ûÎÄ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int s = 1;
		while (N-- > 0) {
			int[][] ss = new int[10][10];
			int n = cin.nextInt();
			ss[n][n] = n;
			for (int i = n; i > 1; i--) {
				for (int j = 1; j < 2 * n; j++) {
					for (int j2 = 1; j2 < 2 * n; j2++) {
						if (ss[j + 1][j2] == i || ss[j - 1][j2] == i || ss[j][j2 + 1] == i || ss[j][j2 - 1] == i) {
							if (ss[j][j2] == 0)
								ss[j][j2] = i - 1;
						}
					}
				}
			}
			System.out.println("Case #" + (s++) + ": ");
			for (int i = 1; i < 2 * n; i++) {
				for (int j = 1; j < 2 * n; j++) {
					if (i + j == 3 * n - 1 || j - i == n - 1) {
						System.out.print(ss[i][j]);
						break;
					}
					if (ss[i][j] != 0)
						System.out.print(ss[i][j] + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}