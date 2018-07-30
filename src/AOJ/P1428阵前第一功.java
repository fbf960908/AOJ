package AOJ;

import java.util.Arrays;
import java.util.Scanner;

public class P1428阵前第一功 {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int[] ss = new int[n];
			for (int i = 0; i < ss.length; i++) {
				ss[i] = cin.nextInt();
			}
			Arrays.sort(ss);
			int k = cin.nextInt();
			int j = 0, i;
			for (i = ss.length - 1; i > 0; i--) {
				if (ss[i] != ss[i - 1]) {
					j++;
				}
				if (j == k) {
					break;
				}
			}
			System.out.println(ss[i]);

		}
		cin.close();
	}
}