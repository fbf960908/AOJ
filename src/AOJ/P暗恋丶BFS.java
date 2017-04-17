package AOJ;

import java.util.Scanner;

public class P°µÁµØ¼BFS {

	static int s[][] = new int[200][200];

	static int ispure(int x1, int y1, int w) {//ÅÐ¶ÏÕý·½ÐÎ
		int pure = s[x1][y1];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				if (s[x1 + i][y1 + j] != pure)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		int r, c, m, w, max = 0;
		Scanner cin = new Scanner(System.in);
		r = cin.nextInt();
		c = cin.nextInt();
		if (r > c)
			m = r;
		else
			m = c;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				s[i][j] = cin.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				for (w = max + 1; w < m; w++) {
					if (i + w <= r && j + w <= c) {
						if (ispure(i, j, w) != 0)
							max = w;
					} else
						break;
				}
			}
		}
		System.out.println(max * max);
	}
}