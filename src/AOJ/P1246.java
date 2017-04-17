package AOJ;

import java.util.Scanner;

public class P1246 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int a = cin.nextInt();
				sum += a;
			}
			System.out.println(sum);
			System.out.println();
		}
		cin.close();
	}
}
