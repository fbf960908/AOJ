package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1792 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int n, m, total = 0;
	static int[] a = new int[10];
	static int[] b = new int[10];
	static int[][] ma = new int[10][10];
	static int[] ans = new int[10];

	public static void main(String[] args) {
		n = cin.nextInt();
		m = cin.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ma[i][j] = cin.nextInt();
			}
		}
		fun(0);
		for (int i = 0; i < n-1; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println(ans[n-1]);
		cin.close();
		cout.close();
	}

	static boolean is() {
		for (int i = 0; i < n - 1; i++) {
			if (ma[a[i]][a[i + 1]] == 1)
				continue;
			else {
				return false;
			}
		}
		return true;
	}

	static void fun(int k) {
		if (k > n - 1) {
			if (is()) {
				total++;
				if (total == m)
					for (int i = 0; i < n; i++) {
						ans[i] = a[i];
					}
			}
			return;
		} else {
			for (int i = 0; i < n; i++) {
				if (b[i] == 0) {
					b[i] = 1;
					a[k] = i;
					fun(k + 1);
					b[i] = 0;
				}
			}
		}
	}
}