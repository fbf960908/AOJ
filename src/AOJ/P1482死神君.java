package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1482死神君 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int ans = 0;
			int[] s = new int[1000001];
			for (int i = 1; i <= n; i++) {
				s[i] = cin.nextInt();
			}
			for (int i = 1; i <= n - 1; i++) {
				ans += Math.min(s[i], s[i + 1]);
			}
			System.out.println(ans);
		}
		cin.close();
		cout.close();
	}
}