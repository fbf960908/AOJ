package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1004 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[] s = { cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt() };
		for (int j = 3; j >= 0; j--) {
			range(ran(s, j));
		}
		cin.close();
		cout.close();
	}

	private static int[] ran(int[] s, int n) {
		int[] ss = new int[s.length - 1];
		for (int i = 0; i < ss.length; i++) {
			if (i >= n)
				ss[i] = s[i + 1];
			else
				ss[i] = s[i];
		}
		return ss;
	}

	public static void range(int[] a) {

		for (int x = 0; x < 3; x++)
			for (int y = 0; y < 3; y++)
				for (int z = 0; z < 3; z++)
					if (x != y && x != z && y != z) {
						System.out.println(a[x] + " " + a[y] + " " + a[z]);
					}
	}
}
