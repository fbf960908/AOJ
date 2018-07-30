package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1488国王的战争 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[][] s = new int[101][101];

	public static void main(String[] args) {
		int N = cin.nextInt();
		int M = cin.nextInt();
		int K = cin.nextInt();
		for (int i = 0; i < K; i++) {
			s[cin.nextInt()][cin.nextInt()] = 1;
		}
		int flag = 0;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (s[i][j] == 1) {
					for (int j2 = i - 1; j2 <= i + 1; j2++) {
						for (int l = j - 1; l <= j + 1; l++) {
							if (s[j2][l] == 1 && j2 != i && l != j) {
								flag++;
							}
						}
					}
				}
				if (flag != 0) {
					break;
				}
			}
			if (flag != 0) {
				break;
			}
		}
		if (flag == 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		cin.close();
		cout.close();
	}
}