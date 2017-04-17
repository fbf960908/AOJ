package AOJ;

import java.util.Scanner;

public class P1318 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		while (a-- > 0) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i % m;
			}
			System.out.println(sum);
		}
	}
}
