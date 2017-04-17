package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P比赛安排 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[][] a = new int[65][65];
	static int[] v = new int[65];

	public static void main(String[] args) {
		int n = cin.nextInt();
		int day = (int)Math.pow(2, n);	
		for (int i = 0; i < day-1; i++) {
			System.out.print("<" + (i + 1) + ">");
			for (int s = 0; s < v.length; s++) {
				v[s] = 0;
			}
			for (int j = 0; j < day / 2; j++) { // 每天n场
				for (int k = 1; k <= day; k++) { // 队伍一
					if (v[k] == 1) // 该天该队伍是否已经比赛
						continue;
					int judge = 0; // 判断k，h这两对如果比赛就跳出，今天不再会有他们的比赛
					for (int h = 1; h <= day; h++) { // 队伍一二
						if (k == h) // 队伍一等于队伍二跳出
							continue;
						if (v[h] == 1) // 该天该队伍是否已经比赛
							continue;
						if (a[k][h] == 0 && a[h][k] == 0) { // h，k两队伍该天是否有一起比赛
							System.out.print(k + "-" + h+ " ");
							v[h] = 1; // 标记h队伍今天不再比赛比赛
							v[k] = 1; // 标记k队伍今天不再比赛比赛
							a[k][h] = 1; // 标记h和k今天已经比赛
							judge = 1; // 标记第j场结束，跳到下一场
							break;
						}
					}
					if (judge == 1) // 第j场结束，跳到下一场
						break;
				}
			}
			System.out.println();
		}
	}
}