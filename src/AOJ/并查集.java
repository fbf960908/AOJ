package AOJ;

import java.util.Scanner;

public class 并查集 {

	static Scanner cin = new Scanner(System.in);
	static int[] father = new int[1000];
	static int[] rank = new int[1000];

	public static void main(String[] args) {
		int N = cin.nextInt();
		int M = cin.nextInt();
		for (int i = 1; i <= N; i++) {
			Make_set(i);
		}
		for (int i = 0; i < M; i++) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			union(x, y);
		}
		
		cin.close();
	}

	static void Make_set(int x) {
		father[x] = x;
		rank[x] = 0;
	}

	static int find(int x) {
		if (x != father[x]) {
			father[x] = find(father[x]);
		}
		return father[x];
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) {
			return;
		}
		if (rank[x] > rank[y]) {
			father[y] = x;
		} else {
			if (rank[x] == rank[y]) {
				rank[y]++;
			}
			father[x] = y;
		}
	}
}