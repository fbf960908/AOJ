package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1230 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int ax = cin.nextInt();
			int ay = cin.nextInt();
			if (ax == ay && ax == 0)
				break;
			int[][] a = new int[ax][ay];
			for (int i = 0; i < ax; i++) {
				for (int j = 0; j < ay; j++) {
					a[i][j] = cin.nextInt();
				}
			}
			int bx = cin.nextInt();
			int by = cin.nextInt();
			int[][] b = new int[bx][by];
			for (int i = 0; i < bx; i++) {
				for (int j = 0; j < by; j++) {
					b[i][j] = cin.nextInt();
				}
			}
			int cx = cin.nextInt();
			int cy = cin.nextInt();
			int[][] c = new int[cx][cy];
			for (int i = 0; i < cx; i++) {
				for (int j = 0; j < cy; j++) {
					c[i][j] = cin.nextInt();
				}
			}
			if (ax == cx && ay == bx && by == cy)
				System.out.println(isAdd(a, b, c) ? "Yes" : "No");
			else
				System.out.println("No");
		}
		cin.close();
		cout.close();
	}

	private static boolean isAdd(int[][] a, int[][] b, int[][] c) {
		int[][] d = mul(a, b);
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[0].length; j++) {
				if (c[i][j] != d[i][j])
					return false;
			}
		}
		return true;
	}

	public static int[][] mul(int[][] a, int[][] b) {
		int[][] arr = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					arr[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return arr;
	}
}
