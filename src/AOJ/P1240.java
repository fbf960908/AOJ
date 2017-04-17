package AOJ;

import java.util.Scanner;

public class P1240 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while (N-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a + b);
		}
		scanner.close();
	}
}