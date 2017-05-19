package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1737 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			int[][] ss = new int[100][2];
			int[] min = new int[200005];
			for (int i = 0; i <= m; i++)
				min[i] = 999999;
			for (int i = 1; i <= n; i++) {
				ss[i][0] = cin.nextInt();
				ss[i][1] = cin.nextInt();
			}
			min[0] = 0;
			for (int i = 1; i <= n; i++)// 蛋糕种类总数
			{
				for (int j = 1; j <= ss[i][1]; j++)// 每种蛋糕数量
				{
					for (int k = m; k >= ss[i][0]; k--)
					{
						min[k] = Math.min(min[k - ss[i][0]] + 1, min[k]);
					}
				}
			}
			if (min[m] == 999999)
				System.out.println("><");
			else

				System.out.println(min[m]);
		}
		cin.close();
		cout.close();
	}
}