package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static char[][] s = new char[1000][1000];

	public static void main(String args[]) {
		int T = cin.nextInt();
		int a = 0;
		while (T-- > 0) {
			a++;
			int n = cin.nextInt();
			int m = cin.nextInt();
			for (int i = 1; i <= n; i++) {
				String str = cin.next();
				for (int j = 1; j <= m; j++) {
					s[i][j] = str.charAt(j - 1);
				}
			}
			for (int i = 0; i < m + 2; i++) {
				s[0][i] = '.';
				s[n + 1][i] = '.';
			}
			for (int i = 0; i < n + 2; i++) {
				s[i][0] = '.';
				s[i][m + 1] = '.';
			}
			BFS(s, 0, 0, n + 2, m + 2);
			int flag = 0;
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s.length; j++) {
					if (s[i][j] == '.')
						flag++;
				}
			}
			if (flag > 0)
				System.out.println("Case #" + a + ": " + "A");
			else
				System.out.println("Case #" + a + ": " + "H");
		}
	}

	private static void BFS(char[][] s, int a, int b, int n, int m) {
		
	}
}
