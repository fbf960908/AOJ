package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1185 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int[][] ss = new int[10000][2];
			int num = 0;
			while (true) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				if (x == y && x == 0)
					break;
				ss[num][0] = x;
				ss[num][1] = y;
				num++;
			}
			int a = 0;
			for (int i = 0; i <= num; i++) {
				for (int j = 0; j < ss[i][1]; j++) {
					a++;
					if (a % N == 0) {
						System.out.println(ss[i][0]);
					} else {
						System.out.print(ss[i][0] + " ");
					}
				}
			}
			int k = N * N - a;
			for (int i = 0; i < k; i++) {
				a++;
				if (a % N == 0) {
					System.out.println("0");
				} else {
					System.out.print("0 ");
				}
			}
		}
		cin.close();
		cout.close();
	}
}
