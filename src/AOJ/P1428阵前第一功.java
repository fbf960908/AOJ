package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1428阵前第一功 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int[] ss = new int[n];
			for (int i = 0; i < ss.length; i++) {
				ss[i] = cin.nextInt();
			}
			int num = 1;
			Arrays.sort(ss);
			if (num == 1) {
				System.out.println(ss[ss.length - 1]);
			}
			num--;
			for (int i = ss.length - 2; i > 0; i--) {
				if (ss[i] != ss[i + 1]) {
					num--;
				}
				if (num == 0) {
					System.out.println(ss[i]);
					break;
				}
			}
		}
		cin.close();
		cout.close();
	}
}