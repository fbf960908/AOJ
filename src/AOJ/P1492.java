package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1492 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int k = cin.nextInt();
			int[][] ss = new int[n / k + 2][k];
			int s = 1;
			for (int i = 1; i <= n / k + 2; i++) {
				for (int j = 0; j < k; j++) {
					if (s > n)
						break;
					ss[i][j] = s++;
				}
			}
			int sum = 0;
			for (int i = 1; i < n / k + 2; i++) {
				for (int j = 0; j < k; j++) {
					if (i % 2 == 1)
						sum -= ss[i][j];
					else
						sum += ss[i][j];
				}
			}
			System.out.println(sum);
		}
		cin.close();
		cout.close();
	}
}
