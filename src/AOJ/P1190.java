package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1190 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int father[], total;

	public static void main(String args[]) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (n == 0 && m == 0)
				break;
			init(n);
			for (int i = 0; i < m; i++) {
				union(cin.nextInt(), cin.nextInt());
			}
			System.out.println(--total);
		}
	}

	private static void union(int x, int y) {
		int p = find(x);
		int q = find(y);
		if (p == q)
			return;
		father[p] = q;
		total--;
	}

	private static int find(int x) {
		return x == father[x] ? x : (father[x] = find(father[x]));
	}

	private static void init(int n) {
		total = n;
		father = new int[n + 1];
		for (int i = 0; i <= n; i++)
			father[i] = i;
	}
}