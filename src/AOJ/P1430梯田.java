package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1430ÌÝÌï {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int T = cin.nextInt();
		while (T-- > 0) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int q = cin.nextInt();
			int length = n * m;
			int[] ss = new int[length];
			for (int i = 0; i < length; i++) {
				ss[i] = cin.nextInt();
			}
			Arrays.sort(ss);
			while (q-- > 0) {
				int num = cin.nextInt();
				int s = length;
				for (int i = 0; i < length; i++) {
					if (ss[i] > num) {
						s = i;
						break;
					}
				}
				int ans = length - s;
				System.out.println(ans);
			}
		}
		cin.close();
		cout.close();
	}
}