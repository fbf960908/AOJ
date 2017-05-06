package AOJ;

import java.util.Scanner;

public class Main {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int M = cin.nextInt();
		int[] ss = new int[N + 1];
		for (int i = 1; i < ss.length; i++) {
			ss[i] = cin.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int sum = 0;
			String str = cin.next();
			int x = cin.nextInt();
			int y = cin.nextInt();
			if (str.equals("ADD")) {
				ss[x] += y;
			} else if (str.equals("QUERY")) {
				for (int j = x; j <= y; j++) {
					sum += ss[j];
				}
				System.out.println(sum);
			}
		}
		cin.close();
	}
}