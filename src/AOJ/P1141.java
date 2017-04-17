package AOJ;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class P1141 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			HashSet set = new HashSet();
			int N = cin.nextInt();
			if (N == 0) {
				break;
			}
			for (int i = 0; i < N; i++) {
				int s = cin.nextInt();
				set.add(s);
			}
			TreeSet sortedSet = new TreeSet(set);
			Object[] sort = sortedSet.toArray();
			System.out.println(sort.length);
			for (int i = 0; i < sort.length - 1; i++) {
				System.out.print(sort[i] + " ");
			}
			System.out.println(sort[sort.length - 1]);
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
