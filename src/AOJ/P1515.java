package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1515 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[][] s = new int[3][3];
		int x = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = x++;
			}
		}
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int[] ss = new int[N];
			for (int i = 0; i < N; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				ss[i] = s[a][b];
			}
			for (int i : ss) {
				System.out.print(i);
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
