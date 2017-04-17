package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class P1121 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int[] ss = new int[N];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = cin.nextInt();
		}

		TreeSet<Integer> list = new TreeSet<>();
		for (int i = 0; i < ss.length; i++) {
			list.add(ss[i]);
		}

		Integer[] s = list.toArray(new Integer[0]);
		System.out.println(s.length);
		for (int i = 0; i < s.length - 1; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.print(s[s.length - 1]);

		cin.close();
		cout.close();
	}
}
