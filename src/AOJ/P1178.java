package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1178 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int a = cin.nextInt();
			int[] ss = new int[a];
			for (int i = 0; i < ss.length; i++) {
				ss[i] = cin.nextInt();
			}
			if (dencha(ss)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		cin.close();
		cout.close();
	}

	private static boolean dencha(int[] ss) {
		Arrays.sort(ss);
		int sub = (ss[ss.length - 1] - ss[0]) / (ss.length - 1);
		for (int i = 1; i < ss.length; i++) {
			if (ss[i] - ss[i - 1] != sub)
				return false;
		}
		return true;
	}
}
