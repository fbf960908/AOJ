package AOJ;

import java.util.Scanner;

public class P1274 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a > b) {
			if (c > a) {
				System.out.println(b + " " + a + " " + c);
			} else if (c < b) {
				System.out.println(c + " " + b + " " + a);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		} else {
			if (c < a) {
				System.out.println(c + " " + a + " " + b);
			} else if (c > b) {
				System.out.println(a + " " + b + " " + c);
			} else {
				System.out.println(a + " " + c + " " + b);
			}
		}
	}
}