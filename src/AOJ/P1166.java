package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1166 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[] ss = new int[1000000];
		int i = 0;
		while (cin.hasNext()) {
			ss[i] = cin.nextInt();
			i++;
		}
		if (isSorted(ss, i))
			System.out.println("YES");
		else
			System.out.println("NO");
		cin.close();
		cout.close();
	}

	private static boolean isSorted(int[] ss, int a) {
		int[] aa = new int[a];
		aa = Arrays.copyOf(ss, a);
		Arrays.sort(aa);
		for (int i = 0; i < a; i++) {
			if (ss[i] != aa[i])
				return false;
		}
		return true;
	}
}
