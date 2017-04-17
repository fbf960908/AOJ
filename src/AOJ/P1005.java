package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1005 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int[][] ar0 = new int[a][a];

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					if (i == j || i + j == a - 1)
						ar0[i][j] = 1;
					else
						ar0[i][j] = 0;

				}
			}

			for (int i = 0; i < a; i++) {
				if (ar0[0][i] == 1)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println();

			for (int i = 0; i < b; i++) {
				for (int j = 1; j < a; j++) {
					for (int k = 0; k < a; k++) {
						if (j + k - a >= 0 && j - k < 0)
							break;
						if (ar0[j][k] == 1)
							System.out.print("X");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
			}
			if (n > 0)
				System.out.println();
		}

		cin.close();
		cout.close();
	}
}
